package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SimpleGetTest {
    private static Logger LOGGER = LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void getALLUsers() {
    LOGGER.info("----------API Test: Read(GET) ALL Users");

        //  Specify the base URL or endpoint of the REST API
        RestAssured.baseURI= "https://reqres.in/api/users";

        //  Get the RequestSpecification of the request that you want to send to the server.
        RequestSpecification httpRequest = RestAssured.given();

        // Make a request to the server and this will return the response.
        Response response = httpRequest.request(Method.GET);
        LOGGER.debug(response.getBody().asPrettyString());


        //Validating the response status code.
        Assert.assertEquals(response.getStatusCode(), 200);

        // Get the Json path object instance from the response.
        JsonPath jsonPath = response.jsonPath();
        List<String> list = jsonPath.get("data.email");

        // Validating the specified email exist in the response body.
        String emailId = "george.bluth@reqres.in";
        boolean emailExist = list.contains(emailId);
        Assert.assertTrue(emailExist, emailId + "does not exist");

        LOGGER.info("----------End Test: Read(GET) All Users");
    }
}

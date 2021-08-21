package automation_test.selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Firefox1 {
    WebDriver driver;

    @Test
    public void runInFirefox() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}






//public class SeleniumGrid_Firefox1 {
//    WebDriver driver;
//    URL gridUrl;
//
//    @Test
//    public void executeInAwsDocker() {
//        FirefoxOptions firefoxOptions =new FirefoxOptions();
//        try {
//            gridUrl = new URL("http:18.223.116.237:4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
//        driver.get("https://www.amazon.com");
//        System.out.println(driver.getTitle());
//        driver.quit();
//    }
//}
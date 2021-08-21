package automation_test.selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;
import java.net.URL;


public class SeleniumGrid_Chrome2 {
    WebDriver driver;

    @Test
    public void runInChrome2() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}








//public class SeleniumGrid_Chrome2 {
//    WebDriver driver;
//    URL gridUrl;
//
//    @Test
//    public void executeInAwsDocker() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        try {
//            gridUrl = new URL("http:18.223.116.237:4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        driver = new RemoteWebDriver(gridUrl, chromeOptions);
//        driver.get("https://www.google.com");
//        System.out.println(driver.getTitle());
//        driver.quit();
//    }
//}
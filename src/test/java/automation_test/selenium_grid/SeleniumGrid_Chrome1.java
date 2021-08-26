package automation_test.selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Chrome1 {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.mortgagecalculator.org/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}


//        ChromeOptions chromeOptions = new ChromeOptions();
//        String ec2Address = ReadConfigFiles.getPropertyValue("EC2PublicIp");
//        try {
//            gridUrl = new URL("http://" + ec2Address + ":4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
////    public void executeInAwsDocker() {
//    public void runInChrome1() throws MalformedURLException {
//
//        driver = TestEnvironment.selectTestExecutionEnvironment();
//        driver.get("https://www.mortgagecalculator.org");
//        System.out.println(driver.getTitle());
//        driver.quit();
//
//

//        ChromeOptions chromeOptions = new ChromeOptions();
//        try {
//            gridUrl = new URL("http:18.223.116.237:4444/wd/hub");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        driver = new RemoteWebDriver(gridUrl, chromeOptions);
//        driver.get("https://www.mortgagecalculator.org/");
//        System.out.println(driver.getTitle());
//        driver.quit();


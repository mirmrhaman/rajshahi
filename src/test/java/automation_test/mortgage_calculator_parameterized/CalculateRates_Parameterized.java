package automation_test.mortgage_calculator_parameterized;

import command_providers.ActOn;
import data_Providers.DataProviderClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_object.Home;
import utilities.ReadConfigFiles;

public class CalculateRates_Parameterized {
    WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(CalculateRates_Parameterized.class);

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("---------- Start Test (CalculateRates) --------------");
        String url = ReadConfigFiles.getPropertyValue("MortgageCalculatorUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with the URL: " + url);
    }

    @Test(dataProvider = "RealAprRates", dataProviderClass = DataProviderClass.class)
    public void calculateRealApr(String HomePrice, String DownPayment, String InterestRate, String AprRate) {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomeValue(HomePrice)
                .clickDownPaymentInDollar()
                .typeDownPayment(DownPayment)
                .typeInterestRate(InterestRate)
                .clickOnCalculateButton()
                .validateRealAprRate(AprRate);
    }

    @AfterMethod
    public void testCleanUp() {
        ActOn.browser(driver).closeBrowser();
        LOGGER.info("== End Test (CalculateRates ==)");
    }
}

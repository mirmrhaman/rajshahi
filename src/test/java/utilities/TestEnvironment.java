package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestEnvironment {
        private static final Logger LOGGER = LogManager.getLogger(utilities.TestEnvironment.class);
        /**
         * This method will select the execution environment based on the user input
         * @return
         * @throws java.net.MalformedURLException
         */
        public static WebDriver selectTestExecutionEnvironment() throws MalformedURLException {
            String environment = System.getProperty("environment") == null ? "local" : System.getProperty("environment");
            String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");

            // Update the GridURL value in the config.properties file if it is needed
            URL gridUrl = new URL(ReadConfigFiles.getPropertyValue("GridURL"));
            WebDriver driver;
            if (environment.equals("remote") && browser.equals("chrome")) {
                LOGGER.info("Execute test in remote with chrome browser");
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new RemoteWebDriver(gridUrl, chromeOptions);
            } else if (environment.equals("remote") && browser.equals("firefox")) {
                LOGGER.info("Executing test in remote with firefox browser");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new RemoteWebDriver(gridUrl, firefoxOptions);
            } else if (environment.equals("remote") && browser.equals("edge")) {
                LOGGER.info("Executing test in remote with edge browser");
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new RemoteWebDriver(gridUrl, edgeOptions);
            }else {
                LOGGER.info("Executing test in local with chrome browser");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            return driver;
        }
}

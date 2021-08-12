//package mortgage_calculator;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class CalculateMonthlyPayment {
//    WebDriver driver;
//    Select select;
//
//
//    @BeforeMethod
//    public void openBrowser() {                 // 0:07:07 for lecture note
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.mortgagecalculator.org/");
//        driver.manage().window().maximize();
//    }
//
//    public void enterMortgageData() {
//        // Enter Home Value "300000"
//        driver.findElement(By.id("homeval")).clear();
//        driver.findElement(By.id("homeval")).sendKeys("300000");
//
//        // Enter Down payment "60000"
//        driver.findElement(By.id("downpayment")).clear();
//        driver.findElement(By.id("downpayment")).sendKeys("60000");
//
//        // Click on the $radio button for the downpayment option
//        driver.findElement(By.xpath("//*[@id='calc']//input[@name ='param[downpayment_type]'][@value='money']")).click();
//
//        // Enter loan amount "240000"
//        driver.findElement(By.id("loanamt")).clear();
//        driver.findElement(By.id("loanamt")).sendKeys("240000");
//
//        // Enter interested rate "3%"
//        driver.findElement(By.id("intrstsrate")).clear();
//        driver.findElement(By.id("intrstsrate")).sendKeys("3");
//
//        // Enter loan term "30" years
//        driver.findElement(By.id("loanterm")).clear();
//        driver.findElement(By.id("loanterm")).sendKeys("30");
//
//        //Selecting the  Month
//        select = new Select(driver.findElement(By.name("param[start_month]")));
//        select.selectByVisibleText("Nov");
//
//        // Entering the year "2021"
//        driver.findElement(By.id("start_year")).clear();
//        driver.findElement(By.id("start_year")).sendKeys("2021");
//
//        // Enter the property tax "5000"
//        driver.findElement(By.id("pptytax")).clear();
//        driver.findElement(By.id("pptytax")).sendKeys("5000");
//
//        // Enter the pmi "0.5"
//        driver.findElement(By.id("pmi")).clear();
//        driver.findElement(By.id("pmi")).sendKeys("0.5");
//
//        // Enter the homeowner insurance "1000"
//        driver.findElement(By.id("hoi")).clear();
//        driver.findElement(By.id("hoi")).sendKeys("1000");
//
//        // Enter the monthly hoa "100"
//        driver.findElement(By.id("hoa")).clear();
//        driver.findElement(By.id("hoa")).sendKeys("100");
//
//        // Selecting the loan type "FHA"
//        select = new Select(driver.findElement(By.name("param[milserve]")));
//        select.selectByVisibleText("FHA");
//
//        // Selecting "Buy" from Buy or Refi dropdown
//        select = new Select(driver.findElement(By.name("param[refiorbuy]")));
//        select.selectByVisibleText("Buy");
//    }
//                            //  0:58:08
//    @Test
//    public void calculateMonthlyPayment() {
//        enterMortgageData();
//
//        // Click on the calculator
//        driver.findElement(By.name("cal")).click();
//
//        boolean monthlyPaymentExist = driver.findElements(By.xpath("//*[@id='calc']//h3[text()='$1,611.85']")).size() > 0;
//        Assert.assertTrue(monthlyPaymentExist, "Total Monthly Payment is wrong");
//
//    }
//
//    @AfterMethod
//    public void closeBrowser() {
//        driver.quit();
//    }
//
//}

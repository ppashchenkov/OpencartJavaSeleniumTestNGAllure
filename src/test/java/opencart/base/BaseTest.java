package opencart.base;

import io.qameta.allure.Allure;
import opencart.data.TestData;
import opencart.utils.DriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import opencart.utils.ReportUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

public abstract class BaseTest {
    private WebDriver driver;

    @BeforeSuite
    protected void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.safaridriver().setup();

    }

    @Parameters("browser")
    @BeforeMethod
    protected void setupDriver(@Optional("chrome") String browser, ITestResult result) {
        Reporter.log("______________________________________________________", true);
        Reporter.log("RUN " + result.getMethod().getMethodName(), true);
        this.driver = DriverUtils.createDriver(browser, this.driver);
        if(getDriver() == null) {
            Reporter.log("ERROR: Unknown parameter 'browser' = '" + browser + "'", true);
            System.exit(1);
        }
        Reporter.log("INFO: " + browser.toUpperCase() + " driver created", true);

        Allure.step("Open base URL.");
        getDriver().get(TestData.BASE_URL);
    }

    @Parameters("browser")
    @AfterMethod(alwaysRun = true)
    protected void tearDown(@Optional("chrome") String browser, ITestResult result) {
        Reporter.log(result.getMethod().getMethodName() + ": " + ReportUtils.getStatus(result), true);
        if (this.driver != null) {
            getDriver().quit();
            Reporter.log("INFO: " + browser.toUpperCase() + " driver closed", true);
            this.driver = null;
        } else {
            Reporter.log("INFO: Driver is null", true);
        }
    }

    protected WebDriver getDriver() {

        return this.driver;
    }
}

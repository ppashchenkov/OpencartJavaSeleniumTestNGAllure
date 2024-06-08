package opencart.base;

import opencart.utils.DriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
    private WebDriver driver;
//    private final String browser = "chrome";
//
    @BeforeSuite
    protected void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
//        WebDriverManager.safaridriver().setup();
        //    WebDriverManager.edgedriver().setup();
        //    WebDriverManager.operadriver().setup();
        //    WebDriverManager.chromiumdriver().setup()
        //    WebDriverManager.iedriver().setup();
    }


    @Parameters("browser")
    @BeforeMethod
    protected void setupDriver(String browser) {
        Reporter.log("______________________________________________________", true);
        this.driver = DriverUtils.createDriver(browser, this.driver);
        if(getDriver() == null) {
            Reporter.log("ERROR: Unknown parameter 'browser' = '" + browser + "'", true);
            System.exit(1);
        }
        Reporter.log("INFO: " + browser.toUpperCase() + " driver created", true);
    }

    @Parameters("browser")
    @AfterMethod(alwaysRun = true)
    protected void tearDown(String browser) {
        if (this.driver != null) {
            getDriver().quit();
            Reporter.log("INFO: " + browser.toUpperCase() + " driver closed", true);
            this.driver = null;
        } else {
            Reporter.log("INFO: Driver is null", true);
        }
    }

    public WebDriver getDriver() {

        return this.driver;
    }
}

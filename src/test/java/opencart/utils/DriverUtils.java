package opencart.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverUtils {
    private static final ChromeOptions chromeOptions;
    private static final FirefoxOptions firefoxOptions;
    private static final SafariOptions safariOptions;

    static {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-web-security");

        firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--window-size=1920,1080");
        firefoxOptions.addArguments("--disable-gpu");
        firefoxOptions.addArguments("--no-sandbox");
        firefoxOptions.addArguments("--disable-dev-shm-usage");
        firefoxOptions.addArguments("--disable-web-security");

        safariOptions = new SafariOptions();
//        safariOptions.("--incognito");
//        safariOptions.addArguments("--headless");
//        safariOptions.addArguments("--window-size=1920,1080");
//        safariOptions.addArguments("--disable-gpu");
//        safariOptions.addArguments("--no-sandbox");
//        safariOptions.addArguments("--disable-dev-shm-usage");
//        safariOptions.addArguments("--disable-web-security");

    }

    private static WebDriver createChromeDriver(WebDriver driver) {
        if (driver == null) {
             return new ChromeDriver(chromeOptions);
        } else {
            driver.quit();
            return new ChromeDriver(chromeOptions);
        }
    }

    private static WebDriver createFirefoxDriver(WebDriver driver) {
        if (driver == null) {
            return new FirefoxDriver(firefoxOptions);
        } else {
            driver.quit();
            return new FirefoxDriver(firefoxOptions);
        }
    }

    private static WebDriver createSafariDriver(WebDriver driver) {
        if (driver == null) {
            return new SafariDriver();
        } else {
            driver.quit();
            return new SafariDriver();
        }
    }

    public static WebDriver createDriver(String browser, WebDriver driver) {
        switch (browser) {
            case "chrome" -> {
                return createChromeDriver(driver);
            }
            case "firefox" -> {
                return createFirefoxDriver(driver);
            }
            case "safari" -> {
                return createSafariDriver(driver);
            }
            default -> {
                return null;
            }
        }
    }
}

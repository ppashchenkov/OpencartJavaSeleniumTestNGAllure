package opencart.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private final WebDriver driver;
    private WebDriverWait wait2;
    private WebDriverWait wait5;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    protected WebDriverWait getWait2() {
        if (this.wait2 == null) {
            this.wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        }

        return this.wait2;
    }

    protected WebDriverWait getWait5() {
        if (this.wait5 == null) {
            this.wait5 = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return this.wait5;
    }
}

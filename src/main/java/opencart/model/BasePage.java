package opencart.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private final WebDriver driver;
    private WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    protected WebDriverWait getWait() {
        if (this.wait == null) {
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        }

        return this.wait;
    }
}

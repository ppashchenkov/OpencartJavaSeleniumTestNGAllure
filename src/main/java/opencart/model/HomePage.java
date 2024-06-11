package opencart.model;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TopMenu {

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li/a[text()='Cameras']")
    private WebElement topMenuCameras;

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    Allure.step("click Top Menu Cameras");
    public CamerasPage clickTopMenuCameras() {
        topMenuCameras.click();

        return new CamerasPage(getDriver());
    }
}

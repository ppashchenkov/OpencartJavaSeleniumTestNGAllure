package opencart.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

abstract class TopMenu extends BasePage {

    @FindBy(linkText = "Cameras")
    private WebElement topMenuCameras;

    protected TopMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Click Gear Top Menu.")
    public CamerasPage clickTopMenuCameras() {
        topMenuCameras.click();

        return new CamerasPage(getDriver());
    }
}
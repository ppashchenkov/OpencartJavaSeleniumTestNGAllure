package opencart.model;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CamerasPage extends SideMenu {

    String cameraXpath = "//img[@title='";

    protected CamerasPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click '{camera}' Img.")
    public ProductPage clickCameraImg(String camera) {
        getWait5().until(ExpectedConditions.visibilityOf(getDriver()
                .findElement(By.xpath(cameraXpath + camera + "']")))).click();

        return new ProductPage(getDriver());
    }
}
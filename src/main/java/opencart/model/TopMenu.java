package opencart.model;

import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;

abstract class TopMenu extends BasePage {

    @FindBy(linkText = "Cameras")
    private WebElement topMenuCameras;

    @FindBy(xpath = "//li[@class='dropdown open']//a[@class='see-all']")
    private WebElement allProductSubmenu;

    @FindBy(css = "h1")
    private WebElement productName;

    protected TopMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Click Cameras Top Menu.")
    public CamerasPage clickTopMenuCameras() {
        topMenuCameras.click();

        return new CamerasPage(getDriver());
    }

    @Step("Click '{productType}' Top Menu.")
    public ProductsPage clickTopMenuProductType(String productType) {
        getDriver().findElement(By.linkText(productType)).click();
        try {
            if (allProductSubmenu.isDisplayed() && allProductSubmenu.isEnabled()) {
                allProductSubmenu.click();
            }
            } catch (Exception e) {}
        return new ProductsPage(getDriver());
    }
}

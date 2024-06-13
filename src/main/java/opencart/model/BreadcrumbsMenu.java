package opencart.model;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

abstract class BreadcrumbsMenu extends TopMenu {

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    private WebElement breadcrumbTop;

    protected BreadcrumbsMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Collect Breadcrumbs Menu Text.")
    public String getBreadcrumbTopText() {

        return breadcrumbTop.getText();
    }
}

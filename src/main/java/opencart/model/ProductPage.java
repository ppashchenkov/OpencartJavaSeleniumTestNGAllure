package opencart.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends TopMenu {

    @FindBy(css = "h1")
    private WebElement productName;

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    private WebElement breadcrumbTop;

    protected ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName() {

        return productName.getText();
    }

    public String getBreadcrumbTopText() {

        return breadcrumbTop.getText();
    }
}

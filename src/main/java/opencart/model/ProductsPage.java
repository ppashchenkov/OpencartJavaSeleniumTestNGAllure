package opencart.model;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class ProductsPage extends SideMenu {

    @FindBy(css = "h2")
    private WebElement productsTitle;

    @FindBy(xpath = "//div[@class='caption']/h4")
    private WebElement productsList;

    @FindBy(xpath = "//div[@class='product-layout product-list col-xs-12']")
    private WebElement product;

    String productXpath = "//img[@title='";

    protected ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get ProductsPage Title")
    public String getProductstitle() {

        return productsTitle.getText();
    }

    @Step("Get Product List")
    public List<WebElement> getProductsList() {
        List<WebElement> lst = new ArrayList<>();
        lst = getDriver().findElements(By.xpath("//div[@class='caption']/h4"));

        return lst;
    }

    @Step("Click '{productName}' Image.")
    public ProductPage clickProductImg(String productName) {
        getWait5().until(ExpectedConditions.visibilityOf(getDriver()
                .findElement(By.xpath(productXpath + productName + "']")))).click();

        return new ProductPage(getDriver());
    }
}
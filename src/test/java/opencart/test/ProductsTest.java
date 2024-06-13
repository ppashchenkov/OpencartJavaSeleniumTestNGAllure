package opencart.test;

import opencart.base.BaseTest;
import opencart.data.TestData;
import opencart.model.HomePage;
import opencart.model.ProductPage;
import opencart.model.ProductsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductsTest extends BaseTest {

    @Test(
            description = "TC-20 Top Menu All Products",
            testName = "PRODUCTS | test All Products",
            dataProvider = "productsData",
            dataProviderClass = TestData.class
    )
    public void testProducts(String productsType) {
        String productName = "";

        ProductsPage products = new HomePage(getDriver()).clickTopMenuProductType(productsType);
        String actualProductsTitle = products.getProductstitle();

        Assert.assertEquals(actualProductsTitle, productsType);

        List<WebElement> productList = new ArrayList<>();
        int productListSize = 0;
        try {
            productList = products.getProductsList();
            productListSize = productList.size();
        } catch (Exception e) {}

        if (productListSize > 0 ) {

                final String expectedProductName = productList.get(productListSize/2).getText();

                ProductPage currentProduct = products.clickProductImg(expectedProductName);

                final String actualProductName = currentProduct.getProductName();
                final String ACTUAL_BREADCRUMB_TEXT = currentProduct.getBreadcrumbTopText();
                final String EXPECTED_BREADCRUMB_TEXT = productsType + " " + actualProductName;

                Assert.assertEquals(actualProductName, expectedProductName);
                Assert.assertEquals(EXPECTED_BREADCRUMB_TEXT, ACTUAL_BREADCRUMB_TEXT);
        }
    }
}
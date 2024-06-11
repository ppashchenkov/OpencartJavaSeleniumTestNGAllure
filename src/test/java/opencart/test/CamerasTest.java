package opencart.test;

import opencart.base.BaseTest;
import opencart.data.TestData;
import opencart.model.HomePage;
import opencart.model.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CamerasTest extends BaseTest {

    @Test(
            description = "TC-10 Top Menu CAMERAS",
            testName = "PRODUCTS | test Cameras",
            dataProvider = "camerasData",
            dataProviderClass = TestData.class
    )
    public void testCameras(String camera) {

        ProductPage productPage = new HomePage(getDriver()).clickTopMenuCameras()
                .clickCameraImg(camera);

        final String ACTUAL_CAMERA_NAME = productPage.getProductName();
        final String ACTUAL_BREADCRUMB_TEXT = productPage.getBreadcrumbTopText();
        final String EXPECTED_BREADCRUMB_TEXT = TestData.CAMERAS_BREADCRUMB_FIRST + camera;

        Assert.assertEquals(camera, ACTUAL_CAMERA_NAME);
        Assert.assertEquals(EXPECTED_BREADCRUMB_TEXT, ACTUAL_BREADCRUMB_TEXT);
    }
}

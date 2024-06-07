package opencart.data;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://naveenautomationlabs.com/opencart";
    public static final String BASE_URL_TITLE = "Your Store";
    public static final String HOME_URL = "/";

    //NavBar Menu
    public static final By TABLETS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Tablets']");
    public static final String TABLETS_URL = "/index.php?route=product/category&path=57";
    public static final String TABLETS_TITLE = "Tablets";

    //all others menus

    public static final By SOFTWARE_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Software']");
    public static final String SOFTWARE_URL = "/index.php?route=product/category&path=17";
    public static final String SOFTWARE_TITLE = "Software";

    public static final By PHONES_PDAS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Phones & PDAs']");
    public static final String PHONES_PDAS_URL = "/index.php?route=product/category&path=24";
    public static final String PHONES_PDAS_TITLE = "Phones & PDAs";

    public static final By CAMERAS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Cameras']");
    public static final String CAMERAS_URL = "/index.php?route=product/category&path=33";
    public static final String CAMERAS_TITLE = "Cameras";

    //Allure.step("SetUp expected results");
    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][] {
                {BASE_URL, TABLETS_MENU, BASE_URL + TABLETS_URL, TABLETS_TITLE},
                {BASE_URL, SOFTWARE_MENU, BASE_URL + SOFTWARE_URL, SOFTWARE_TITLE},
                {BASE_URL, PHONES_PDAS_MENU, BASE_URL + PHONES_PDAS_URL, PHONES_PDAS_TITLE},
                {BASE_URL, CAMERAS_MENU, BASE_URL + CAMERAS_URL, CAMERAS_TITLE}
        };
    }



}

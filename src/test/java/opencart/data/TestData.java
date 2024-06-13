package opencart.data;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class TestData {
    public static final String BASE_URL = "https://naveenautomationlabs.com/opencart";
    public static final String BASE_URL_TITLE = "Your Store";
    public static final String HOME_URL = "/";

    public static final By DESKTOPS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Desktops']");
    public static final String DESKTOPS = "Desktops";
    public static final By SUB_PC_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_26']");
    public static final String SUB_PC_URL = "/index.php?route=product/category&path=20_26";
    public static final String SUB_PC_TITLE = "PC";
    public static final By SUB_MAC_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=20_27']");
    public static final String SUB_MAC_URL = "/index.php?route=product/category&path=20_27";
    public static final String SUB_MAC_TITLE = "Mac";
    public static final By SUB_ALL_DESKTOPS_MENU = By.xpath("//div/a[text()='Show All Desktops']");
    public static final String SUB_ALL_DESKTOPS_URL = "/index.php?route=product/category&path=20";
    public static final String SUB_ALL_DESKTOPS_TITLE = "Desktops";

    public static final By LAPTOPS_NBOOK_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Laptops & Notebooks']");
    public static final String LAPTOPS_NOTEBOOKS = "Laptops & Notebooks";

    public static final By SUB_MACS_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18_46']");
    public static final String SUB_MACS_URL = "/index.php?route=product/category&path=18_46";
    public static final String SUB_MACS_TITLE = "Macs";

    public static final By SUB_WINDOWS_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=18_45']");
    public static final String SUB_WINDOWS_URL = "/index.php?route=product/category&path=18_45";
    public static final String SUB_WINDOWS_TITLE = "Windows";

    public static final By SUB_ALL_LAPTOPS_MENU = By.xpath("//div/a[text()='Show All Laptops & Notebooks']");
    public static final String SUB_ALL_LAPTOPS_URL = "/index.php?route=product/category&path=18";
    public static final String SUB_ALL_LAPTOPS_TITLE = "Laptops & Notebooks";

    public static final By COMPONENTS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Components']");
    public static final String COMPONENTS = "Components";

    public static final By SUB_MICE_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_29']");
    public static final String SUB_MICE_URL = "/index.php?route=product/category&path=25_29";
    public static final String SUB_MICE_TITLE = "Mice and Trackballs";

    public static final By SUB_MONITORS_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28']");
    public static final String SUB_MONITORS_URL = "/index.php?route=product/category&path=25_28";
    public static final String SUB_MONITORS_TITLE = "Monitors";

    public static final By SUB_PRINTERS_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_30']");
    public static final String SUB_PRINTERS_URL = "/index.php?route=product/category&path=25_30";
    public static final String SUB_PRINTERS_TITLE = "Printers";

    public static final By SUB_SCANNERS_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_31']");
    public static final String SUB_SCANNERS_URL = "/index.php?route=product/category&path=25_31";
    public static final String SUB_SCANNERS_TITLE = "Scanners";

    public static final By SUB_WEB_MENU = By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_32']");
    public static final String SUB_WEB_URL = "/index.php?route=product/category&path=25_32";
    public static final String SUB_WEB_TITLE = "Web Cameras";

    public static final By SUB_ALL_COMPONENTS_MENU = By.xpath("//div/a[text()='Show All Components']");
    public static final String SUB_ALL_COMPONENTS_URL = "/index.php?route=product/category&path=25";
    public static final String SUB_ALL_COMPONENTS_TITLE = "Components";

    public static final By MP3PLAYERS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='MP3 Players']");
    public static final String MP3PLAYERS = "MP3 Players";

    static final By SUB_ALL_MP3PLAYERS_MENU = By.xpath("//div/a[text()='Show All MP3 Players']");
    public static final String SUB_ALL_MP3PLAYERS_URL = "/index.php?route=product/category&path=34";
    public static final String SUB_ALL_MP3PLAYERS_TITLE = "MP3 Players";

    public static final By TABLETS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Tablets']");
    public static final String TABLETS ="Tablets";
    public static final String TABLETS_URL = "/index.php?route=product/category&path=57";
    public static final String TABLETS_TITLE = "Tablets";

    public static final By SOFTWARE_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Software']");
    public static final String SOFTWARE = "Software";
    public static final String SOFTWARE_URL = "/index.php?route=product/category&path=17";
    public static final String SOFTWARE_TITLE = "Software";

    public static final By PHONES_PDAS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Phones & PDAs']");
    public static final String PHONES_PDAS = "Phones & PDAs";
    public static final String PHONES_PDAS_URL = "/index.php?route=product/category&path=24";
    public static final String PHONES_PDAS_TITLE = "Phones & PDAs";

    public static final By CAMERAS_MENU = By.xpath("//ul[@class='nav navbar-nav']//li/a[text()='Cameras']");
    public static final String CAMERAS = "Cameras";
    public static final String CAMERAS_URL = "/index.php?route=product/category&path=33";
    public static final String CAMERAS_TITLE = "Cameras";
    public static final String CAMERA_CANON = "Canon EOS 5D";
    public static final String CAMERA_NIKON = "Nikon D300";
    public static final String CAMERAS_BREADCRUMB_FIRST = "Cameras ";

    @DataProvider(name = "navigationData")
    public static Object[][] getNavMenuData() {
        return new Object[][] {
                {true, DESKTOPS_MENU, SUB_PC_MENU, BASE_URL + SUB_PC_URL, SUB_PC_TITLE},
                {true, DESKTOPS_MENU, SUB_MAC_MENU, BASE_URL + SUB_MAC_URL, SUB_MAC_TITLE},
                {true, DESKTOPS_MENU, SUB_ALL_DESKTOPS_MENU, BASE_URL + SUB_ALL_DESKTOPS_URL, SUB_ALL_DESKTOPS_TITLE},
                {true, LAPTOPS_NBOOK_MENU, SUB_MACS_MENU, BASE_URL + SUB_MACS_URL, SUB_MACS_TITLE},
                {true, LAPTOPS_NBOOK_MENU, SUB_WINDOWS_MENU, BASE_URL + SUB_WINDOWS_URL, SUB_WINDOWS_TITLE},
                {true, LAPTOPS_NBOOK_MENU, SUB_ALL_LAPTOPS_MENU, BASE_URL + SUB_ALL_LAPTOPS_URL, SUB_ALL_LAPTOPS_TITLE},
                {true, COMPONENTS_MENU, SUB_MICE_MENU, BASE_URL + SUB_MICE_URL, SUB_MICE_TITLE},
                {true, COMPONENTS_MENU, SUB_MONITORS_MENU, BASE_URL + SUB_MONITORS_URL, SUB_MONITORS_TITLE},
                {true, COMPONENTS_MENU, SUB_PRINTERS_MENU, BASE_URL + SUB_PRINTERS_URL, SUB_PRINTERS_TITLE},
                {true, COMPONENTS_MENU, SUB_SCANNERS_MENU, BASE_URL + SUB_SCANNERS_URL, SUB_SCANNERS_TITLE},
                {true, COMPONENTS_MENU, SUB_WEB_MENU, BASE_URL + SUB_WEB_URL, SUB_WEB_TITLE},
                {true, COMPONENTS_MENU, SUB_ALL_COMPONENTS_MENU, BASE_URL + SUB_ALL_COMPONENTS_URL, SUB_ALL_COMPONENTS_TITLE},
                {false, TABLETS_MENU, null, BASE_URL + TABLETS_URL, TABLETS_TITLE},
                {false, SOFTWARE_MENU, null, BASE_URL + SOFTWARE_URL, SOFTWARE_TITLE},
                {false, PHONES_PDAS_MENU, null, BASE_URL + PHONES_PDAS_URL, PHONES_PDAS_TITLE},
                {false, CAMERAS_MENU, null, BASE_URL + CAMERAS_URL, CAMERAS_TITLE},
                {true, MP3PLAYERS_MENU, SUB_ALL_MP3PLAYERS_MENU, BASE_URL + SUB_ALL_MP3PLAYERS_URL, SUB_ALL_MP3PLAYERS_TITLE}
        };
    }

    @DataProvider(name = "camerasData")
    public static Object[][] getProductData() {
        return new Object[][]{
                {CAMERA_CANON},
                {CAMERA_NIKON}
        };
    }

    @DataProvider(name = "productsData")
    public static Object[][] getProductsData() {
        return new Object[][]{
                {DESKTOPS},
                {LAPTOPS_NOTEBOOKS},
                {COMPONENTS},
                {TABLETS},
                {SOFTWARE},
                {PHONES_PDAS},
                {CAMERAS},
                {MP3PLAYERS}
        };
    }
}

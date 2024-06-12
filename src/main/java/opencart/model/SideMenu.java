package opencart.model;

import org.openqa.selenium.WebDriver;

abstract class SideMenu extends TopMenu {

    protected SideMenu(WebDriver driver) {
        super(driver);
    }
}
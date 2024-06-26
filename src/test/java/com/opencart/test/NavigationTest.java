package com.opencart.test;

import com.opencart.base.BaseTest;
import com.opencart.data.TestData;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test(
            groups = {"smoke", "regression"},
            description = "TC-01 Open Base URL",
            testName = "NAVIGATION | Open Base URL"
    )
    @Story("Navigation")
    @Severity(SeverityLevel.BLOCKER)
    @Description("To verify that the base URL and title of the application are correct and as expected.")
    @Link(TestData.BASE_URL)
    public void testOpenBaseURL() {
        Allure.step("Set up expected results.");
        final String expectedURL = TestData.BASE_URL + TestData.HOME_URL;
        final String expectedTitle = TestData.BASE_URL_TITLE;

        Allure.step("Collect actual URL and actual title.");
        final String actualURL = getDriver().getCurrentUrl();
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify that the actual URL is as expected.");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify that the actual title is as expected.");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(
            groups = {"smoke", "regression"},
            description = "TC-02 Top Menu Navigation",
            testName = "NAVIGATION | test Main Menu",
            dataProvider = "navigationData",
            dataProviderClass = TestData.class
    )
    @Story("Navigation")
    @Severity(SeverityLevel.CRITICAL)
    @Description("To verify that the top menu navigation on the website functions correctly by ensuring that " +
            "clicking on menu items directs the user to the expected URL with the expected title.")
    @Link(TestData.BASE_URL)
    public void testNavigationMenu(Boolean multi, By navbarMenu, By subMenu, String expectedURL, String expectedTitle) {
        Allure.step("Click on " + "\"" + expectedTitle + "\"");
        getDriver().findElement(navbarMenu).click();
        if(multi) {
            getDriver().findElement(subMenu).click();
        }

        Allure.step("Collect actualURL, actualTitle");
        final String actualURL = getDriver().getCurrentUrl();
        final String actualTitle = getDriver().getTitle();

        Allure.step("Verify actualURL as expected");
        Assert.assertEquals(actualURL, expectedURL);
        Allure.step("Verify actualTitle as expected");
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

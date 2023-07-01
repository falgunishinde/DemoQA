package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MenuPageDataProviderTests extends BaseTests {

    @DataProvider(name = "menuPageSubList")
    public static Object[][] dataProvider() {
        return new Object[][]{

                {"Main Item 2", "SUB SUB List", "Sub Sub Item 1"},
                {"Main Item 2", "SUB SUB List", "Sub Sub Item 2"},

        };
    }

    @Test(dataProvider = "menuPageSubList")
    public void menuPageTests(String mainMenu, String mainItem2, String subSubList) {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Menu");
        menuPage.hoverMenuItems(mainMenu);
        menuPage.hoverMainItem2(mainItem2);
        waitTime();
        menuPage.hoverSubSubList(subSubList);
    }

    @DataProvider(name = "menuPageSubItem")
    public static Object[][] dataProvider1() {
        return new Object[][]{

                {"Main Item 2", "Sub Item 1"},
                {"Main Item 2", "Sub Item 2"},
        };
    }

    @Test(dataProvider = "menuPageSubItem")
    public void menuPageSubItemTests(String mainMenu, String mainItem2) {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Menu");
        menuPage.hoverMenuItems(mainMenu);
        menuPage.hoverMainItem2(mainItem2);
    }

    @DataProvider(name = "menuPageMainItem")
    public static Object[][] dataProvider2() {
        return new Object[][]{

                {"Main Item 1"},
                {"Main Item 2"},
                {"Main Item 3"},
        };
    }

    @Test(dataProvider = "menuPageMainItem")
    public void menuPageMainItemTests(String mainMenu) {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Menu");
        menuPage.hoverMenuItems(mainMenu);
    }
}

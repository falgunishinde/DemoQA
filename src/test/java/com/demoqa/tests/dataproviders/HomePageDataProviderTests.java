package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageDataProviderTests extends BaseTests {

    @DataProvider(name = "TestHomePage")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Elements"},
                {"Forms"},
                {"Alerts, Frame & Windows"},
                {"Widgets"},
                {"Interactions"},
                {"Book Store"}
        };
    }

    @Test(dataProvider = "TestHomePage")
    public void testHomeMenu(String menu) {
        homePage.chooseHomePageMenu(menu);
        Assert.assertEquals(methods.getTitleName(), menu);
    }
}

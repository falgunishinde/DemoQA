package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LinksPageDataProviderTests extends BaseTests {

    @DataProvider(name = "TestLinksPage")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Home"},
                {"HomeNS9dP"}
        };
    }

    @Test(dataProvider = "TestLinksPage", priority = -1)
    public void testLinksPage(String links) {

        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Links");
        linksPage.clickLinks(links);
        waitTime();
        Assert.assertEquals(linksPage.getTitles(0), "Following links will open new tab");
    }

    @DataProvider(name = "TestLinksApiCall")
    public static Object[][] dataProvider1() {
        return new Object[][]{
                {"Created","201"},
                {"No Content","204"},
                {"Moved Permanently","301"},
                {"Bad Request","400"},
                {"Unauthorized","401"},
                {"Forbidden","403"},
                {"Not Found","404"}
        };
    }

    @Test(dataProvider = "TestLinksApiCall")
    public void testApiLinksPage(String links,String codes) {

        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Links");
        linksPage.clickApiLinks(links);
        Assert.assertEquals(linksPage.getTitles(1), "Following links will send an api call");
        Assert.assertEquals(linksPage.response(),linksPage.codes(codes,links));
    }

}

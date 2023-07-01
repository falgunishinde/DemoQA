package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicPropertiesTests extends BaseTests {

    @Test
    public void dynamicTest(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Dynamic Properties");
        Assert.assertEquals(dynamicPropertiesPage.text(),"This text has random Id");
        waitTime();
        dynamicPropertiesPage.clickPage(0);
        waitTime();
        dynamicPropertiesPage.clickPage(1);
        waitTime();
        dynamicPropertiesPage.clickPage(2);
        waitTime();
    }
}

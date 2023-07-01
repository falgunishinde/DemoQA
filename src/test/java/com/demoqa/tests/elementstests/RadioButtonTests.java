package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTests {
    @Test(priority = -1)
    public void testSelectedYesButton(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Radio Button");
        Assert.assertEquals(methods.getTitleName(),"Radio Button");
        waitTime();
        radioButtonPage.clickButton(0);
        Assert.assertEquals(radioButtonPage.responseRadioButton(),"You have selected Yes");    }

    @Test
    public void testSelectedImpressiveButton(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Radio Button");
        Assert.assertEquals(methods.getTitleName(),"Radio Button");
        waitTime();
        radioButtonPage.clickButton(1);
        Assert.assertEquals(radioButtonPage.responseRadioButton(),"You have selected Impressive");

    }
}

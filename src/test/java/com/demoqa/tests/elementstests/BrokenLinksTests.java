package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinksTests extends BaseTests {

    @Test
    public void clickBrokenImages(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Broken-Links Images");
        brokenLinks.clickImages(0);
    }

    @Test
    public void clickBrokenImages1(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Broken-Links Images");
        brokenLinks.clickImages(1);
    }

    @Test
    public void clickValidLink(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Broken-Links Images");
        waitTime();
        brokenLinks.clickLinks(0);
    }

    @Test
    public void clickBrokenLink(){
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Broken-Links Images");
        waitTime();
        brokenLinks.clickLinks(1);
        Assert.assertEquals(brokenLinks.brokenLinkResponse(),"This page returned a 500 status code.\n\nFor a definition and common list of HTTP status codes, go here");
    }
}

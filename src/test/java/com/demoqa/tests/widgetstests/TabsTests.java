package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabsTests extends BaseTests {
    @Test
    public void tabsPageTest() {
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Tabs");
        Assert.assertEquals(tabsPage.getUnderTitle(),"Details about Lorem Ipsum");
        tabsPage.chooseTab("Origin");
        waitTime();
        tabsPage.chooseTab("Use");
        waitTime();
        tabsPage.chooseTab("What");
    }
}

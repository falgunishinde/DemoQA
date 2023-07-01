package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipsTests extends BaseTests {
    @Test
    public void toolTipsPageTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Tool Tips");
        toolTipsPage.hoverMeToSeeButton();
        Assert.assertEquals(toolTipsPage.assertionHoverButtonText(),"Hover me to see");
        waitTime();
        toolTipsPage.hoverMeToSeeTextField();
        waitTime();
        toolTipsPage.hoverTheChosenLink("Contrary");
        Assert.assertEquals(toolTipsPage.assertionHoverLink(0),"Contrary");
        waitTime();
        toolTipsPage.hoverTheChosenLink("1.10.32");
        Assert.assertEquals(toolTipsPage.assertionHoverLink(1),"1.10.32");
    }
}

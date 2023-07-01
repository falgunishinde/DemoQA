package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.staticvariables.StaticVariables;
import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFramesTests extends BaseTests {
    @Test
    public void childFrameAndBackToMainTest() {
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Nested Frames");
        nestedFramesPage.switchNestedFramesToChild();
        Assert.assertEquals(nestedFramesPage.getChildText(), "Child Iframe");
        waitTime();
        methods.switchToMainWindow();
        Assert.assertEquals(nestedFramesPage.getMainText(), StaticVariables.nestedFrames);
    }

    @Test
    public void parentFrameTest() {
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Nested Frames");
        nestedFramesPage.switchNestedFramesToParent();
        Assert.assertEquals(nestedFramesPage.getParentText(), "Parent frame");
    }
}

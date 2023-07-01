package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.staticvariables.StaticVariables;
import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames(){
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Frames");
        framesPage.switchToFrame1();
        Assert.assertEquals(framesPage.frameTitle(),"This is a sample page");
        methods.switchToParentFrame();
        Assert.assertEquals(framesPage.getMainText(), StaticVariables.frames);
        waitTime();
        framesPage.switchToFrame2();
        Assert.assertEquals(framesPage.frameTitle(),"This is a sample page");

    }
}

package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTests {
    @Test
    public void alertButtonsTests(){
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Alerts");
        waitTime();
        alertsPage.clickAlertButton();
        waitTime();
        methods.acceptAlert();
        alertsPage.clickUntilAlertIsPresent();
        waitTime();
        methods.acceptAlert();
        alertsPage.clickConfirmButton();
        waitTime();
        methods.dismissAlert();
        Assert.assertEquals(alertsPage.confirmButtonResponse(),"You selected Cancel");
        alertsPage.clickPromptButton();
        waitTime();
        alertsPage.enterPromptData("Natasha");
        methods.acceptAlert();
        Assert.assertEquals(alertsPage.promptResultResponse(),"You entered Natasha");
    }
}

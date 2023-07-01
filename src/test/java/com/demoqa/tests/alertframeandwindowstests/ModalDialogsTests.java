package com.demoqa.tests.alertframeandwindowstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalDialogsTests extends BaseTests {

    @Test
    public void modalDialogTest(){
        homePage.chooseHomePageMenu("Alerts, Frame & Windows");
        browserWindowPage.chooseAlertsMenu("Modal Dialogs");
        modalDialogsPage.clickSmallModal();
        Assert.assertEquals(modalDialogsPage.smallModalResponse(),"Small Modal");
        waitTime();
        modalDialogsPage.clickCloseSmallModal();
        modalDialogsPage.clickLargeModal();
        Assert.assertEquals(modalDialogsPage.largeModalResponse(),"Large Modal");
        waitTime();
        modalDialogsPage.clickCloseLargeModal();
    }
}

package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTests {

    @Test
    public void testCheckBoxExpansion() {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Check Box");
        checkBoxPage.expandHome();
        // Expands Desktop,Documents or Downloads
        checkBoxPage.expandUnderHome("Desktop");
        checkBoxPage.expandUnderHome("Documents");
        checkBoxPage.expandUnderHome("Downloads");
        // expand  for Work Space & Office under Documents
        checkBoxPage.expandUnderDocuments("WorkSpace");
        checkBoxPage.expandUnderDocuments("Office");
        waitTime();
        //collapse all =1, expands=0
        checkBoxPage.expandAndCollapseAll(1);
        waitTime();
        checkBoxPage.expandAndCollapseAll(0);

        Assert.assertEquals(methods.getTitleName(), "Check Box");
    }

}

package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class AutoCompleteTests extends BaseTests {
    @Test
    public void autocompleteMultipleColorTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Auto Complete");
        autoCompletePage.enterAutoMultipleColors("Red");
        autoCompletePage.enterAutoMultipleColors("Blue");
        autoCompletePage.enterAutoMultipleColors("Green");
    }
    @Test
    public void autocompleteSingleColorTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Auto Complete");
        autoCompletePage.enterSingleColor("Black");
    }
}

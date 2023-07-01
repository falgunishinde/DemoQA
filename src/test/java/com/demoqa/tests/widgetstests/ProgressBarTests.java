package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class ProgressBarTests extends BaseTests {
    @Test
    public void progressBarPageTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Progress Bar");
        waitTime();
        progressBarPage.clickProgressBar(100);
    }
}

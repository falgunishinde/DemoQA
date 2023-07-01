package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void sliderPageTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Slider");
        waitTime();
        sliderPage.sliderDragAndDrop(49);
    }
}

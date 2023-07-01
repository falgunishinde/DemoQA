package com.demoqa.tests.widgetstests;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.Test;

public class DatePickerTests extends BaseTests {
    @Test
    public void datePickerPageTest(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Date Picker");
        datePickerPage.selectDate("10/01/2021");
    }
    @Test
    public void datePickerTest2(){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Date Picker");
        waitTime();
        datePickerPage.enterDateAndTime("September 1,2021 8:35 AM");
    }
}

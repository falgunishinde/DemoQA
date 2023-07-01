package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccordianPageDataProviderTests extends BaseTests {

    @DataProvider(name = "accordianPageTests")
        public static Object [][] dataProvider(){
            return new Object[][] {
                    {"Lorem Ipsum"},
                    {"Where does it come from?"},
                    {"Why do we use it?"},

            };
        }

    @Test(dataProvider = "accordianPageTests")
    public void accordianTest(String accordian){
        homePage.chooseHomePageMenu("Widgets");
        accordianPage.chooseWidgetsMenu("Accordian");
        accordianPage.clickCard(accordian);
    }
}

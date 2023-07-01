package com.demoqa.tests.dataproviders;

import com.demoqa.staticvariables.StaticVariables;
import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Locale;

public class CheckBoxPageDataProviderTests extends BaseTests {

    @DataProvider(name = "TestCheckBoxPage")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Home"}, {"Desktop"}, {"Notes"}, {"Commands"}, {"Documents"}, {"Workspace"}, {"React"}, {"Angular"}, {"Veu"},
                {"Office"}, {"Public"}, {"Private"}, {"Classified"}, {"General"}, {"Downloads"}, {"Word File.doc"}, {"Excel File.doc"}
        };
    }

    @Test(dataProvider = "TestCheckBoxPage")
    public void testHomeMenu(String checkBox) {

        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Check Box");
        checkBoxPage.expandAndCollapseAll(0);
        waitTime();
        checkBoxPage.checkBoxElements(checkBox);
      //  Assert.assertEquals(checkBoxPage.result(),"You have selected : "+checkBoxPage.getResponse(0));

    }
}

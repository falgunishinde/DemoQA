package com.demoqa.tests.dataproviders;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TextBoxPageDataProviderTests extends BaseTests {
    @DataProvider(name = "TestTextBoxPage")
    public static Object[][] dataProvider() {
        return new Object[][]{
                {"Natasha Kostovska", "test@test.com", "Skopje", "Skopje,NM"},
        };
    }

    @Test(dataProvider = "TestTextBoxPage")
    public void testTextBox(String fullName, String email, String currentAddress, String permanentAddress) {

        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Text Box");
        Assert.assertEquals(methods.getTitleName(),"Text Box");
        waitTime();
        textBoxPage.enterFullName(fullName);
        textBoxPage.enterMail(email);
        textBoxPage.enterCAddress(currentAddress);
        textBoxPage.enterPAddress(permanentAddress);
        textBoxPage.clickSubmit();
        waitTime();

        Assert.assertEquals(textBoxPage.assertionResponse("Name"), "Name:" + fullName);
        Assert.assertEquals(textBoxPage.assertionResponse("Email"), "Email:" + email);
        Assert.assertEquals(textBoxPage.assertionResponse("Current Address"), "Current Address :" + currentAddress);
        Assert.assertEquals(textBoxPage.assertionResponse("Permanent Address"), "Permananet Address :" + permanentAddress);
        waitTime();
    }
}

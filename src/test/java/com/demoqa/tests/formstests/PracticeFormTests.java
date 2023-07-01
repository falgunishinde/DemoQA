package com.demoqa.tests.formstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import java.util.Locale;

public class PracticeFormTests extends BaseTests {

    @Test
    public void practiseFormTest() throws IOException, InterruptedException {
        String fakerName=ukFaker.name().firstName();  //chooses the random fake first name
        String fakerLastName=ukFaker.name().lastName();  //chooses the random fake first name
        String fakerEmail=ukFaker.name().username().toLowerCase(Locale.ROOT);
        String fakerMobile=ukFaker.numerify("1141234569");
        String fakerDate=faker.date().birthday().toString();
        String fakerAddress=ukFaker.address().streetAddress();

        homePage.chooseHomePageMenu("Forms");
        practiceFormPage.clickPracticeForm();
        practiceFormPage.enterFirstName(fakerName);
        practiceFormPage.enterLastName(fakerLastName);
        practiceFormPage.enterEmail(fakerEmail+"@test.com");
        practiceFormPage.gender("Female");
        practiceFormPage.enterMobileNumber(fakerMobile);
        practiceFormPage.dateOfBirth(fakerDate);
        practiceFormPage.enterSubjects("Maths");
        practiceFormPage.enterSubjects("English");
        practiceFormPage.enterSubjects("Computer Science");
        practiceFormPage.enterSubjects("Physics");
        practiceFormPage.chooseHobby("Sports");
        practiceFormPage.chooseHobby("Reading");
        practiceFormPage.chooseHobby("Music");
        waitTime();
        practiceFormPage.uploadPicture("src/test/resources/autoitfiles/FileUpload.exe");
        waitTime();
        practiceFormPage.enterCurrentAddress(fakerAddress);
        practiceFormPage.state("NCR");
        practiceFormPage.city("Delhi");
        practiceFormPage.submit();
        waitTime();



        Assert.assertEquals(practiceFormPage.response(),"Thanks for submitting the form");
        Assert.assertEquals(practiceFormPage.getText(0),fakerName+" "+fakerLastName);
        Assert.assertEquals(practiceFormPage.getText(1),fakerEmail+"@test.com");
        Assert.assertEquals(practiceFormPage.getText(2),"Female");
        Assert.assertEquals(practiceFormPage.getText(3),fakerMobile);
       // Assert.assertEquals(practiceFormPage.getText(4),fre());
        Assert.assertEquals(practiceFormPage.getText(5),"Maths, English, Computer Science, Physics");
        Assert.assertEquals(practiceFormPage.getText(6),"Sports, Reading, Music");
        Assert.assertEquals(practiceFormPage.getText(7),"Response_codes_TestingREST7.png");
        Assert.assertEquals(practiceFormPage.getText(8),fakerAddress);
        Assert.assertEquals(practiceFormPage.getText(9),"NCR Delhi");

        practiceFormPage.clickClose();
    }
}

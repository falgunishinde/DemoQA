package com.demoqa.tests.elementstests;

import com.demoqa.tests.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadAndDownloadTests extends BaseTests {

    @Test
    public void downloadFile(){

        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Upload and Download");
        Assert.assertEquals(methods.getTitleName(),"Upload and Download");
        uploadAndDownloadPage.clickDownloadButton();
        waitTime();
     }

    @Test
    public void chooseFileToUpload()  {
        homePage.chooseHomePageMenu("Elements");
        buttonsPage.chooseElementsMenu("Upload and Download");
        Assert.assertEquals(methods.getTitleName(),"Upload and Download");
        uploadAndDownloadPage.clickChooseFile("C:\\Users\\Natasha.Kostovska\\Documents\\Nate.docx");
        waitTime();
    }
}

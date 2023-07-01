package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage extends Methods {

    By download = By.id("downloadButton");
    By upload = By.id("uploadFile");

    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public void clickDownloadButton() {
        javaExecutorScrollIntoView(download);
        click(download);
    }

    public void clickChooseFile(String pathOfFile) {
        javaExecutorScrollIntoView(upload);
        sendKeys(upload, pathOfFile);
    }
}

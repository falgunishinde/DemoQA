package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage extends Methods {

    By frame1 = By.id("frame1");
    By frame2 = By.id("frame2");
    By frameHeading1 = By.id("sampleHeading");
    By mainWindowText = By.xpath("//*[contains(text(),\"Sample\")]");

    public FramesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }
    public void switchToFrame1() {
        switchToFrame(frame1);
    }
    public String frameTitle() {
        return getText(frameHeading1);
    }
    public void switchToFrame2() {
        switchToFrame(frame2);
    }
    public String getMainText() {
        return getText(mainWindowText);
    }
}

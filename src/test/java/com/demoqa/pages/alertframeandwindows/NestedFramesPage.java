package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesPage extends Methods {

    By frame1= By.id("frame1");
    By textChild=By.xpath("//body/p");
    By parentText=By.xpath("//*[text()=\"Parent frame\"]");
    By mainText=By.xpath("//*[contains(text(),\"Sample\")]");

    public NestedFramesPage(WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }
    public void switchNestedFramesToChild(){
        switchToFrame(frame1);
        switchToFrameByIndex(0);
    }
    public String getChildText(){
        return getText(textChild);
    }
    public void switchNestedFramesToParent(){
        switchToFrame(frame1);
    }
    public String getParentText(){
        return getText(parentText);
    }
    public String getMainText(){
        return getText(mainText);
    }

}

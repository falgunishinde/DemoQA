package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage extends Methods {

    By hoverButton = By.id("toolTipButton");
    By hoverTextField = By.id("toolTipTextField");
    By links = By.xpath("//*[@href=\"javascript:void(0)\"]");

    public ToolTipsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void hoverMeToSeeButton() {
        moveToElement(hoverButton);
    }

    public void hoverMeToSeeTextField() {
        moveToElement(hoverTextField);
    }

    public void hoverTheChosenLink(String linkName) {
        int i = arrayListToInt(StaticVariables.LINK_NAME, linkName);
        moveToElements(links,i);
    }
    public String assertionHoverButtonText(){
        return getText(hoverButton);
    }
    public String assertionHoverLink(int index){
        return getTexts(links,index);
    }

}

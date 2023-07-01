package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends Methods {

    By response=By.className("mt-3");
    By buttons=By.xpath("//*[contains(@class,\"custom-control-inline\")]");

    public RadioButtonPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }
    public void clickButton(int i){
        clickActionsWithIndex(buttons,i);
    }

    public String responseRadioButton(){
        return getText(response);
    }
}

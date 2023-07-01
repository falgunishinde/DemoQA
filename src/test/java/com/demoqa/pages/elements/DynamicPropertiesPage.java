package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends Methods {

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
       super(driver,wait,actions);
    }

    By buttons= By.xpath("//*[contains(@class,\"btn-primary\")]");
    By text=By.xpath("//*[contains(text(),\"This text has random Id\")]");

    public void clickPage(int i){
        clickWithIndex(buttons,i);
    }
    public String text(){
        return getText(text);
    }
}

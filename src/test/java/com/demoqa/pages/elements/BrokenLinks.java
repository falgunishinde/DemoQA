package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks extends Methods {

    public BrokenLinks(WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }

    By images= By.xpath("//*[contains(@src,\"/images/Toolsqa\")]");
    By links=By.xpath("//*[contains(text(),\"Click Here for\")]");
    By brokenLink=By.xpath("//*[text()[contains(.,'500')]]");

    public void clickImages(int i){
        clickWithIndex(images,i);
    }

    public void clickLinks(int i){
        javaExecutorScrollIntoView(links);
        clickWithIndex(links,i);
    }
    public String brokenLinkResponse(){
        return getText(brokenLink);
    }

}

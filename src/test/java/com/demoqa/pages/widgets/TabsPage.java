package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsPage extends Methods {

    By tabs= By.xpath("//*[contains(@href,\"#\")]");
    By underTitle=By.xpath("//*[contains(text(),\"Details about\")]");
    By assertText=By.className("mt-3");

    public TabsPage(WebDriver driver, WebDriverWait wait, Actions actions) {
       super(driver,wait,actions);
    }

    public void chooseTab(String tab){
        int i= ArrayUtils.indexOf(StaticVariables.TABS_MENU,tab);
        clickWithIndex(tabs,i);
    }
    public String getUnderTitle(){
       return getText(underTitle);
    }
    public String getTabText(int i){
        return getTexts(assertText,i);
    }
}

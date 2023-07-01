package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage extends Methods {
    By mainItems = By.xpath("//*[contains(text(),\"Main Item\")]");
    By mainItem2=By.xpath("//*[text()=\"Sub Item\" or contains(text(),\"SUB\")]");
    By subSubList=By.xpath("//*[contains(text(),\"Sub Sub\")]");

    public MenuPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void hoverMenuItems(String menuItem) {
        int i = arrayListToInt(StaticVariables.MAIN_ITEMS, menuItem);
        moveToElements(mainItems,i);
    }

    public void hoverMainItem2(String menuItem2){
        int i = arrayListToInt(StaticVariables.MAIN_ITEM_2, menuItem2);
        moveToElements(mainItem2,i);
    }
    public void hoverSubSubList(String subItem){
        int i = arrayListToInt(StaticVariables.SUB_SUB_LIST, subItem);
        moveToElements(subSubList,i);
    }
}

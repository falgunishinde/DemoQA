package com.demoqa.pages;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Methods {

    By clickHomePageItem = By.className("card-up");

    public HomePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public void chooseHomePageMenu(String homeMenu) {
        int indexOfElement = arrayListToInt(StaticVariables.HOME_MENU_ITEMS, homeMenu);
        javaExecutorScrollIntoView(clickHomePageItem);
        clickWithIndex(clickHomePageItem,indexOfElement);
    }

}

package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccordianPage extends Methods {
    By card= By.className("card");
    By clickWidgetsItems = By.xpath("//*[contains(@class,\"collapse show\")]/ul/li");

    public AccordianPage(WebDriver driver,WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }

    public void chooseWidgetsMenu(String widgetsMenuList) {
        int i = ArrayUtils.indexOf(StaticVariables.WIDGETS_MENU, widgetsMenuList);
        javaExecutorScrollIntoView(clickWidgetsItems);
        clickWithIndex(clickWidgetsItems,i);
    }
    public void clickCard(String cardName){
        int i = ArrayUtils.indexOf(StaticVariables.CARD_NAME, cardName);
        javaExecutorScrollIntoView(card);
        clickWithIndex(card,i);
    }
}

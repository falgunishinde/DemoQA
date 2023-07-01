package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage extends Methods {

    public LinksPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    By responseCode = By.id("linkResponse");
    By links = By.xpath("//*[@href=\"https://demoqa.com\" and @target=\"_blank\"]");
    By apiLinks = By.xpath("//*[@href=\"javascript:void(0)\"]");
    By titles = By.tagName("strong");

    public void clickLinks(String linkName) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_LINKS_MENU, linkName);
        clickActionsWithIndex(links,i);
    }

    public void clickApiLinks(String linkName) {
        int i = arrayListToInt(StaticVariables.ELEMENTS_API_LINKS_MENU, linkName);
        javaExecutorScrollIntoView(apiLinks);
        clickActionsWithIndex(apiLinks,i);
    }

    public String response() {
        javaExecutorScrollIntoView(responseCode);
        return getText(responseCode);
    }

    public String getTitles(int i) {
        return getTexts(titles,i);
    }

    public String codes(String code,String text){
        return "Link has responded with staus "+code+" and status text "+text;
    }
}

package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends Methods {

    By home = By.xpath("//*[@class=\"rct-text\"]/button");
    By underHome = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li/span/button");
    By underDocuments = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li/span/button");
    By expandCollapseButtons = By.xpath("//*[@id=\"tree-node\"]/div/button/*/*");
    By checkbox = By.className("rct-checkbox");
    By response=By.className("text-success");
    By message=By.id("result");

    public CheckBoxPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }
    public void expandHome() {
        click(home);
    }
    public void expandUnderHome(String expandHome) {
        int i = arrayListToInt(StaticVariables.EXPAND_HOME, expandHome);
        javaExecutorScrollIntoView(underHome);
        clickWithIndex(underHome, i);
    }
    public void expandUnderDocuments(String documentsSubmenu) {
        int i = ArrayUtils.indexOf(StaticVariables.EXPAND_DOCUMENTS, documentsSubmenu);
        javaExecutorScrollIntoView(underDocuments);
        clickWithIndex(underDocuments, i);
    }
    public void expandAndCollapseAll(int i) {
        clickActionsWithIndex(expandCollapseButtons, i);
    }
    public void checkBoxElements(String enterCheckboxName) {
        int i = arrayListToInt(StaticVariables.CHECK_BOX_ITEMS, enterCheckboxName);
        javaExecutorScrollIntoView(checkbox);
        clickWithIndex(checkbox, i);
    }
    public String getResponse(int i){
      return getTexts(response,i);
    }
    public String result(){
        return getText(message);
    }

}


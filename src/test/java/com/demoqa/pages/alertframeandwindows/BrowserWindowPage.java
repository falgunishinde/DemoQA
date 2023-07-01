package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowPage extends Methods {
    By alerts = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By newTab = By.id("tabButton");
    By newWindow=By.id("windowButton");
    By newWindowMessage=By.id("messageWindowButton");
    By title=By.id("sampleHeading");

    public BrowserWindowPage(WebDriver driver, WebDriverWait wait, Actions actions) {
       super(driver,wait,actions);
    }

    public void chooseAlertsMenu(String alertsName) {
        int i = ArrayUtils.indexOf(StaticVariables.ALERTS_MENU, alertsName);
        javaExecutorScrollIntoView(alerts);
        clickWithIndex(alerts,i);
    }

    public void click_new_tab() {
        click(newTab);
    }

    public void click_new_window(){
        click(newWindow);
    }
    public String returnNewWindowTitle(){
        return getText(title);
    }

    public void clickNewMessage(){
        click(newWindowMessage);
    }
}

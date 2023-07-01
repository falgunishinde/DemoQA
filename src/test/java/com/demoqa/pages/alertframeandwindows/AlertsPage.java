package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends Methods {

    By alertButton= By.id("alertButton");
    By timerAlert=By.id("timerAlertButton");
    By confirmButton=By.id("confirmButton");
    By promptButton =By.id("promtButton");
    By confirmResult=By.id("confirmResult");
    By promptResult=By.id("promptResult");

    public AlertsPage( WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }
    public void clickAlertButton(){
        click(alertButton);
    }
    public void clickUntilAlertIsPresent(){
        click(timerAlert);
        alertIsPresent();
    }
    public void clickConfirmButton(){
        click(confirmButton);
    }
    public String confirmButtonResponse(){
        return getText(confirmResult);
    }
    public void clickPromptButton(){
        click(promptButton);
    }
    public void enterPromptData(String enterName){
        switchToAlert().sendKeys(enterName);
    }
    public String promptResultResponse(){
        return getText(promptResult);
    }
}

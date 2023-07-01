package com.demoqa.pages.alertframeandwindows;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends Methods {

    By smallModalButton= By.id("showSmallModal");
    By largeModalButton=By.id("showLargeModal");
    By smallResponse=By.id("example-modal-sizes-title-sm");
    By largeResponse=By.id("example-modal-sizes-title-lg");
    By closeSmallModal=By.id("closeSmallModal");
    By closeLargeModal=By.id("closeLargeModal");

    public ModalDialogsPage(WebDriver driver, WebDriverWait wait, Actions actions){
      super(driver,wait,actions);
    }

    public void clickSmallModal(){
        click(smallModalButton);
    }
    public void clickLargeModal(){
        click(largeModalButton);
    }
    public void clickCloseSmallModal()
    {
        click(closeSmallModal);
    }
    public String smallModalResponse(){
        return getText(smallResponse);
    }
    public String largeModalResponse(){
        return getText(largeResponse);
    }
    public void clickCloseLargeModal(){
        click(closeLargeModal);
    }
}

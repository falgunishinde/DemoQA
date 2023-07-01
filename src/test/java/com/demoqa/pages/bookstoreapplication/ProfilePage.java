package com.demoqa.pages.bookstoreapplication;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends Methods {
    By goToBookStoreButton = By.id("gotoStore");
    By searchBox=By.id("searchBox");
    By loggedInUsername =By.id("userName-value");
    By addToCollection=By.id("addNewRecordButton");
    By deleteBook=By.id("delete-record-undefined");
    By button=By.id("submit");
    By link=By.xpath("//*[@id=\"notLoggin-label\"]//a");

    public ProfilePage(WebDriver driver,WebDriverWait wait, Actions actions){
        super(driver,wait,actions);
    }

    public void clickGoToBookStoreButton(){
       javaExecutorScrollIntoView(goToBookStoreButton);
       clickActions(goToBookStoreButton);
    }
    public void writeBookToSearch(String book){
        sendKeys(searchBox,book);
    }
    public String getUsernameText(){
        return getText(loggedInUsername);
    }
    public void addBook(){
        javaExecutorScrollIntoView(addToCollection);
        click(addToCollection);
    }
    public void deleteChosenBook(int index){
        clickWithIndex(deleteBook,index);
    }
    public void chooseActionToTake(String buttons){
        int i=arrayListToInt(StaticVariables.CHOOSE_BUTTON, buttons);
        javaExecutorScrollIntoView(button);
        clickWithIndex(button,i);
    }
    public void chooseLoginOrRegistration(String logOrRegister){
        int i=arrayListToInt(StaticVariables.CHOOSE_LOGIN_REGISTER,logOrRegister);
        moveToElement(link);
        clickActionsWithIndex(link,i);
    }
}

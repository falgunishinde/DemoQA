package com.demoqa.pages.bookstoreapplication;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage extends Methods {

    public BookStorePage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    By bookStoreApp = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By searchBox = By.id("searchBox");
    By selectRows = By.tagName("select");
    By pages = By.xpath("//*[@type=\"number\"]");
    By title = By.className("action-buttons");
    By backButton = By.id("addNewRecordButton");
    By next = By.xpath("//button[text()=\"Next\"]");
    By previous = By.xpath("//button[text()=\"Previous\"]");
    By loginButton = By.id("login");

    public void chooseBookStoreMenu(String elementsMenuList) {
        int i = arrayListToInt(StaticVariables.BOOKSTORE_MENU, elementsMenuList);
        javaExecutorScrollIntoView(bookStoreApp);
        clickWithIndex(bookStoreApp,i);
    }

    public void searchbox(String book) {
        sendKeys(searchBox,book);
    }

    public void select(String rows) {
        getOptions(selectRows);
        selectByValue(selectRows,rows);
    }

    public void numberOfPages(String num) {
        sendKeys(pages,num);
    }

    public void openBookByTitle(String book) {//list of the books array
        int i =arrayListToInt(StaticVariables.BOOKS_LIST, book);
        javaExecutorScrollIntoView(title);
        clickActionsWithIndex(title,i);
    }

    public void clickBackToBookstore() {
        javaExecutorScrollIntoView(backButton);
        clickActions(backButton);
    }

    public void clickNextPage() {
        clickActions(next);
    }

    public void clickPreviousPage() {
        clickActions(previous);
    }

    public void clickLoginButton() {
        moveToElement(loginButton);
        clickActions(loginButton);
    }
}

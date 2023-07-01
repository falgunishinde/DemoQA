package com.demoqa.pages.bookstoreapplication;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Methods {

    By welcomeText = By.xpath("//*[contains(@style,\"margin-bottom: 50px;\")]");
    By userName = By.id("userName");
    By password = By.id("password");
    By newUserButton = By.id("newUser");
    By registerText = By.xpath("//*[contains(text(),\"Register to Book Store\")]");
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By registerButton = By.id("register");
    By backToLoginButton = By.id("gotologin");
    By captchaFrame = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
    By clickCaptcha = By.cssSelector("div.recaptcha-checkbox-checkmark");

    public LoginPage(WebDriver driver, WebDriverWait wait, Actions actions) {
       super(driver,wait,actions);
    }

    public String getWelcomeText() {
        return getText(welcomeText);
    }

    public void enterUsername(String user) {
        sendKeys(userName,user);
    }

    public void enterPassword(String pass) {
        sendKeys(password,pass);
    }

    public void clickNewUserForRegistration() {
        click(newUserButton);
    }

    public String getRegisterText() {
        return getText(registerText);
    }

    public void enterFirstName(String firstname) {
        sendKeys(firstName,firstname);
    }

    public void enterLastName(String lastname) {
        sendKeys(lastName,lastname);
    }

    public void clickRegisterButton() {
        javaExecutorScrollIntoView(registerText);
        click(registerButton);
    }

    public void clickBackToLogin() {
        moveToElement(backToLoginButton);
        clickActions(backToLoginButton);
    }
      public void hookForCaptcha(){
        availableFrameAndSwitchToIt(captchaFrame);
        javaExecutorScrollIntoView(clickCaptcha);
        clickActions(clickCaptcha);
    }
}

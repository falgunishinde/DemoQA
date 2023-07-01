package com.demoqa.pages.forms;

import com.demoqa.methods.Methods;
import com.demoqa.staticvariables.StaticVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class PracticeFormPage extends Methods {

    By item = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");
    By email = By.id("userEmail");
    By ca = By.id("currentAddress");
    By date = By.id("dateOfBirthInput");
    By phoneNum = By.id("userNumber");
    By fName = By.id("firstName");
    By lName = By.id("lastName");
    By submitButton = By.id("submit");
    By subjects = By.id("subjectsInput");
    By hobbies = By.xpath("//*[contains(@class,\"custom-checkbox\")]");
    By genderOption = By.xpath("//*[contains(@class,\"custom-radio\")]");
    By states = By.id("react-select-3-input");
    By cities = By.id("react-select-4-input");
    By picture = By.id("uploadPicture");
    By responseTitle = By.xpath("//*[text()=\"Thanks for submitting the form\"]");
    By assertionList = By.xpath("//td[2]");
    By close = By.id("closeLargeModal");

    public PracticeFormPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    public void clickPracticeForm() {
        click(item);
    }

    public void enterFirstName(String firstName) {
        sendKeys(fName, firstName);
    }

    public void enterLastName(String lastname) {
        sendKeys(lName, lastname);
    }

    public void gender(String gender) {
        int i = arrayListToInt(StaticVariables.GENDER, gender);
        clickWithIndex(genderOption, i);
    }

    public void enterEmail(String eMail) {
        sendKeys(email, eMail);
    }

    public void enterMobileNumber(String mobile) {
        if (mobile.length() == 10) {
            sendKeys(phoneNum, mobile);
        } else {
            System.out.println("The number must contain 10 digits");
        }
    }

    public void dateOfBirth(String dob) {
        dateSendKeys(date,dob);
    }

    public void enterSubjects(String subject) {
        sendKeysEnter(subjects, subject);
    }

    public void chooseHobby(String hobby) {
        int i = arrayListToInt(StaticVariables.HOBBIES, hobby);
        moveToElement(hobbies);
        clickActionsWithIndex(hobbies,i);
    }

    public void enterCurrentAddress(String currentAddress) {
        sendKeysEnter(ca,currentAddress);
    }

    public void submit() {
        moveToElement(submitButton);
        clickActions(submitButton);
    }

    public void uploadPicture(String path) throws IOException, InterruptedException {
            uploadFileWithAutoIt(picture,path);
    }

    public void state(String state) {
        sendKeysEnter(states,state);
    }

    public void city(String city) {
        sendKeysEnter(cities,city);
    }

    public String response() {
        return getText(responseTitle);
    }

    public String getText(int i) {
        return getTexts(assertionList,i);
    }

    public void clickClose() {
        click(close);
    }

}

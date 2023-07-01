package com.demoqa.pages.elements;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends Methods {

    By add= By.id("addNewRecordButton");
    By registrationForm=By.id("registration-form-modal");
    By firstName=By.id("firstName");
    By lastName=By.id("lastName");
    By email=By.id("userEmail");
    By age =By.id("age");
    By salary=By.id("salary");
    By department=By.id("department");
    By submit=By.id("submit");
    By searchBox=By.id("searchBox");
    By page=By.xpath("//*[contains(@type,\"number\")]");
    By selectRow=By.tagName("select");
    By deleteEntry=By.xpath("//*[contains(@title,\"Delete\")]");
    By editEntry=By.xpath("//*[contains(@title,\"Edit\")]");
    By next=By.xpath("//button[text()=\"Next\"]");
    By previous=By.xpath("//button[text()=\"Previous\"]");

    public WebTablesPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void clickAddButton(){
        javaExecutorClick(add);
    }
    public String titleRegistrationForm(){
        return getText(registrationForm);
    }
    public void typeToSearch(String search){
        sendKeys(searchBox,search);
    }
    public void selectRows(String row){
        getOptions(selectRow);
        selectByValue(selectRow,row);
    }
    public void enterPageNumber(String pageNumber){
       sendKeys(page,pageNumber);
    }
    public void enterFirstName(String firstname) {
        sendKeys(firstName,firstname);
    }
    public void enterLastName(String lastname) {
        sendKeys(lastName,lastname);
    }
    public void enterEmail(String eMail) {
        sendKeys(email,eMail);
    }
    public void enterAge(String enterYourAge){
        sendKeys(age,enterYourAge);
    }
    public void enterSalary(String enterYourSalary){
        sendKeys(salary,enterYourSalary);
    }
    public void enterDepartment(String enterYourDepartment){
        sendKeys(department,enterYourDepartment);
    }
    public void clickSubmit(){
        click(submit);
    }
    public void clickNextPage(){
        click(next);
    }
    public void clickPreviousPage(){
        click(previous);
    }
    public void editEntryFromTable(int editItem){
        clickWithIndex(editEntry,editItem);
    }
    public void deleteEntryFromTable(int deleteItem){
        clickWithIndex(deleteEntry,deleteItem);
    }
}

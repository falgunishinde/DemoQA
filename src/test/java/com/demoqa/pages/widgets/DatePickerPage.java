package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage extends Methods {
    By date = By.id("datePickerMonthYearInput");
    By dateAndTime = By.id("dateAndTimePickerInput");

    public DatePickerPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
    }

    public void selectDate(String enterDate) {
        dateSendKeys(date,enterDate);
    }

    public void enterDateAndTime(String enterDateTime){
        dateSendKeys(dateAndTime,enterDateTime);
    }


}

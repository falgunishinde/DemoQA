package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    By startStopResetButton = By.xpath("//*[contains(@class,\"btn btn-primary\")]");
    By progressBar = By.xpath("//*[contains(@class,\"progress-bar\")]");

    public ProgressBarPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        this.driver = driver;
        this.wait = wait;
        this.actions = actions;
    }

    public void clickProgressBar(int enterValue) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(startStopResetButton));
        actions.click(element).perform();
        WebElement progress = wait.until(ExpectedConditions.visibilityOfElementLocated(progressBar));
        int width = progress.getSize().getWidth();
        width = width/2;
        System.out.println(width);
          actions.click(element).perform();

    }

}

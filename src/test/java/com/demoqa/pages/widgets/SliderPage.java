package com.demoqa.pages.widgets;

import com.demoqa.methods.Methods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderPage extends Methods {
     By slider = By.className("range-slider__wrap");

    public SliderPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver,wait,actions);
        }

    public int getSliderPixels(WebElement slider, double amount, double sliderMax, double sliderMin) {
        int pixels;
        double sliderWidth = slider.getSize().getWidth();
        sliderWidth = sliderWidth/(sliderMax-sliderMin);
        sliderWidth = sliderWidth * (amount - sliderMin);
        pixels = (int) sliderWidth;
        return pixels;
    }

    public void sliderDragAndDrop(int value) {
        int pixelsToMove = getSliderPixels(element(slider), value, 100, 0);
        clickAndHoldSlider(slider,-(int)widthOfElement(slider)/2,0,pixelsToMove,0);
    }
}


package com.daniel.apps.liberty.mukubvu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private  static WebDriver webDriver;
    public void setWebDriver(WebDriver webDriver){
        BasePage.webDriver= webDriver;
    }



    protected WebElement find(By locator){
        return  webDriver.findElement(locator);
    }


    protected  void set(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected String  windowUrl(){

        return webDriver.getCurrentUrl();
    }
}

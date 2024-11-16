package com.daniel.apps.liberty.mukubvu.utils.selenium;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait extends Utility {



    public static void  waitForAnElement(By locator, int duration){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }
}

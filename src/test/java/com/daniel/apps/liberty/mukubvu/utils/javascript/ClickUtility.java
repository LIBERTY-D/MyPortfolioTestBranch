package com.daniel.apps.liberty.mukubvu.utils.javascript;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ClickUtility extends Utility {

    public  static void  clickJs(String element){
        WebElement elm = driver.findElement(By.xpath(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                elm);
    }
}

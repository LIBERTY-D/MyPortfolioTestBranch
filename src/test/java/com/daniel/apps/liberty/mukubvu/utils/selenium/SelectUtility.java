package com.daniel.apps.liberty.mukubvu.utils.selenium;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import org.openqa.selenium.By;

public class SelectUtility extends Utility {

     private static org.openqa.selenium.support.ui.Select myNewSelect(By locator){
         return  new org.openqa.selenium.support.ui.Select(driver.findElement(locator));
     }


     public  static void selectByVisibleText(By locator, String text){
          myNewSelect(locator).selectByVisibleText(text);
     }


    public  static void selectByIndex(By locator, int index){
        myNewSelect(locator).selectByIndex(index);
    }
    public  static void selectByValue(By locator, String value){
        myNewSelect(locator).selectByValue(value);
    }
}

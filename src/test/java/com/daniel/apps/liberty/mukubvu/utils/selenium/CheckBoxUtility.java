package com.daniel.apps.liberty.mukubvu.utils.selenium;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import com.daniel.apps.liberty.mukubvu.utils.javascript.ClickUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxUtility extends Utility {

    private static  WebElement find(By locator){

        return  driver.findElement(locator);

    }

    public  static  Boolean isCheckBoxSelected(By locator){
        return  find(locator).isSelected();
    }

    public  static  void selectCheckBox(By locator){
         if(!isCheckBoxSelected(locator)){
             ClickUtility.clickJs("//input[@id='checkbox']");
         }
    }
}

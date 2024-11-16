package com.daniel.apps.liberty.mukubvu.utils.javascript;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUtility extends Utility {


    public static  void scrollToElement(By locator){
        String exe =  "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(exe,
                driver.findElement(locator));
    }
}

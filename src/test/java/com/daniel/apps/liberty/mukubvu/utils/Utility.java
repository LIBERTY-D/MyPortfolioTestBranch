package com.daniel.apps.liberty.mukubvu.utils;

import org.openqa.selenium.WebDriver;

public class Utility {

    protected static WebDriver driver;
    public static void setUtility(WebDriver webDriver){
        Utility.driver = webDriver;
    }
}

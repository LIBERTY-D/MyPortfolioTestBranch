package com.daniel.apps.liberty.mukubvu.utils.selenium;

import com.daniel.apps.liberty.mukubvu.utils.Utility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtility extends Utility {

    public  static  void captureScreenShot(File path) throws IOException {
        File screenshot =
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(screenshot,path);
    }
}

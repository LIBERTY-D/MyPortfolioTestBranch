package com.daniel.apps.liberty.mukubvu.pages;

import com.daniel.apps.liberty.mukubvu.utils.java.Reusable;
import com.daniel.apps.liberty.mukubvu.utils.selenium.Wait;
import org.openqa.selenium.By;

public class ResumePage extends HomePage{

    private By downloadResumeButtonLink = By.xpath("//div[@id='root']//a" +
            "[@download='liberty-daniel-mukubvu.pdf']");

    public  String getCurrentUrl(){
        return windowUrl();
    }

    public String getDownloadResume(){
        return find(downloadResumeButtonLink).getAttribute("download");
    }

    public  void downloadResume(){
        click(downloadResumeButtonLink);

    }


}

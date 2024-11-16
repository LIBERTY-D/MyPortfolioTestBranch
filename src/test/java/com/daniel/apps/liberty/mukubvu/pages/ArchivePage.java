package com.daniel.apps.liberty.mukubvu.pages;

import com.daniel.apps.liberty.mukubvu.utils.selenium.Wait;
import org.openqa.selenium.By;

public class ArchivePage extends HomePage{

    private By taskManagerTableData = By.xpath("//table[contains(@class," +
            "'archive-table')]//tr[4]//td[2]");

    public  String getCurrentUrl(){
        return windowUrl();
    }

    public  String getTaskManagerTableData(){
        Wait.waitForAnElement(taskManagerTableData,20);
        return  find(taskManagerTableData).getText();
    }

}

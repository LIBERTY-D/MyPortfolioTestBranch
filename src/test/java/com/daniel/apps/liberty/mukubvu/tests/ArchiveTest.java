package com.daniel.apps.liberty.mukubvu.tests;

import com.daniel.apps.liberty.mukubvu.utils.java.Reusable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArchiveTest extends BaseTest{

    @Test
    public  void testEnteredResumePage(){
        String expected =  "https://liberty-mukubvu.netlify.app/archive";
        String actual =  homePage.goToArchivePage().getCurrentUrl();
        Assert.assertEquals(actual,expected, Reusable.message(actual,expected));
    }

    @Test
    public  void testTableRowData(){
        String actual =  homePage.goToArchivePage().getTaskManagerTableData();
        String expected ="task-manager-backend";
        Assert.assertEquals(actual,expected, Reusable.message(actual,expected));
    }
}

package com.daniel.apps.liberty.mukubvu.tests;

import com.daniel.apps.liberty.mukubvu.pages.ResumePage;
import com.daniel.apps.liberty.mukubvu.utils.java.Reusable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResumePageTest extends BaseTest{


    @Test
    public  void testEnteredResumePage(){
        String expected =  "https://liberty-mukubvu.netlify.app/resume";
        String actual =  homePage.goToResumePage().getCurrentUrl();
        Assert.assertEquals(actual,expected, Reusable.message(actual,expected));
    }



    @Test
    public  void testDownloadFileNameResume(){

        String actualFileName =  homePage.goToResumePage().getDownloadResume();
        String expectedFileName = "liberty-daniel-mukubvu.pdf";

        Assert.assertEquals(actualFileName,expectedFileName,
                Reusable.message(actualFileName,expectedFileName));
    }
    @Test
    public  void testDownloadResume(){

        ResumePage resumePage = homePage.goToResumePage();
        String actualFileName =  resumePage.getDownloadResume();
        String expectedFileName = "liberty-daniel-mukubvu.pdf";

        Assert.assertEquals(actualFileName,expectedFileName,
                Reusable.message(actualFileName,expectedFileName))
        ;
        resumePage.downloadResume();
        boolean exists =  Reusable.isDownloaded(DOWNLOAD_FILE_PATH,
                actualFileName);

        Assert.assertTrue(exists);

    }
}

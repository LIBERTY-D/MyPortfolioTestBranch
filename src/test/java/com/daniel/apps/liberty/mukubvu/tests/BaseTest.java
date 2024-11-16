package com.daniel.apps.liberty.mukubvu.tests;

import com.daniel.apps.liberty.mukubvu.pages.BasePage;
import com.daniel.apps.liberty.mukubvu.pages.HomePage;
import com.daniel.apps.liberty.mukubvu.utils.Utility;
import com.daniel.apps.liberty.mukubvu.utils.selenium.ScreenshotUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Map;

public class BaseTest {

    private WebDriver webDriver;


    protected HomePage homePage;

    protected BasePage basePage;

    private final String BASE_URL = "https://liberty-mukubvu.netlify.app/";

    protected final String DOWNLOAD_FILE_PATH = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "resumes").toString();
    protected final String FAILURE_SCREENSHOT_FILE_PATH =
            Paths.get(System.getProperty(
            "user.dir"), "src", "test", "resources", "screenshots").toString();



    @BeforeClass
    public void setUp(){

        EdgeOptions options = new EdgeOptions();
        options.setExperimentalOption("prefs", Map.of(
                "download.default_directory", DOWNLOAD_FILE_PATH,
                "download.prompt_for_download", false,
                "plugins.always_open_pdf_externally", true
        ));
        webDriver =  new EdgeDriver(options);
        webDriver.manage().window().maximize();

    }

    @BeforeMethod
    public  void setUpApplication(){
        webDriver.get(BASE_URL);
        basePage = new BasePage();
        basePage.setWebDriver(webDriver);
        Utility.setUtility(webDriver);
        homePage = new HomePage();
    }

    @AfterMethod
    public  void tearDown(ITestResult result) throws InterruptedException {

        if(result.getStatus()==ITestResult.FAILURE){
            try {
                File savePath =
                        new File(FAILURE_SCREENSHOT_FILE_PATH+"-"+ new Date().getSeconds() +
                                "-"+result.getName()+".png");
                ScreenshotUtility.captureScreenShot(savePath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        Thread.sleep(5000);
        webDriver.quit();
    }
}

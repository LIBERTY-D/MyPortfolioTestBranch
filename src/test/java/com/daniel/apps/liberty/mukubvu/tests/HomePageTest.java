package com.daniel.apps.liberty.mukubvu.tests;

import com.daniel.apps.liberty.mukubvu.utils.java.Reusable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends  BaseTest{


    @Test
    public  void testWelcomeHeaderText(){

        String expectedText="Welcome to My Portfolio";
        String actualText=homePage.getWelcomeHeaderText();
        Assert.assertEquals(actualText,expectedText,
                Reusable.message(actualText,expectedText));
    }

    @Test
    public  void testViewMyWorkButtonLinkScroll(){
        String actualText =  "My Portfolio";
        String expected = homePage.getMyMyPortfolioWorkSectionHead();

        homePage.clickViewMyWorkButtonLink();
        Assert.assertEquals(actualText,expected,Reusable.message(actualText,
                expected));


    }
    @Test
    public  void testNavbarExperienceInternalLinkButtonScroll(){
        String actualText = homePage.getMySkillsSectionHeadText();
        String expected =  "My Expertise";
        homePage.clickNavbarExperienceInternalLinkButton();
        Assert.assertEquals(actualText,expected,Reusable.message(actualText,
                expected));



    }
    @Test
    public  void testHitMeUpSectionInternalLinkButtonScroll(){

        homePage.clickHitMeUpSectionInternalLinkButton();
        String  actual=  homePage.getContactSectionHeadText();
        String expected  =  "Contact Me";
        Assert.assertEquals(actual,expected,Reusable.message(actual,expected));
    }

    @Test
    public  void testContactSectionInput(){

         homePage.clickHitMeUpSectionInternalLinkButton();
         homePage.setEmailInput("john@mail.com");
         homePage.setFirstNameInput("john");
         homePage.setLastNameInput("doe");
         homePage.setMessageInput("I need to know how i can collaborate " +
                 "with you.");


         homePage.setPhoneNumberInput("778 255 089");
         homePage.setChooseTopicOption("Enquiry");
         homePage.setCheckBoxTerms();
         homePage.clickSubmitFormButton();


    }



}

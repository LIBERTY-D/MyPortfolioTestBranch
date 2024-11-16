package com.daniel.apps.liberty.mukubvu.pages;

import com.daniel.apps.liberty.mukubvu.utils.javascript.ClickUtility;
import com.daniel.apps.liberty.mukubvu.utils.javascript.ScrollUtility;
import com.daniel.apps.liberty.mukubvu.utils.selenium.CheckBoxUtility;
import com.daniel.apps.liberty.mukubvu.utils.selenium.SelectUtility;
import com.daniel.apps.liberty.mukubvu.utils.selenium.Wait;
import org.openqa.selenium.By;

public class HomePage extends  BasePage {

    private  By welcome_header_text =By.xpath("//div[@id='root']//h1" +
            "[text" +
            "()='Welcome" +
            " to My Portfolio']") ;
    private  By viewMyWorkButtonLink = By.xpath("//section[@id='hero']//a" +
            "[text()='View My Work']");
    private  By myPortfolioWorkSection =  By.id("MyPortfolio");

    private  By myMyPortfolioWorkSectionHead =  By.xpath("//section[@id" +
            "='MyPortfolio']//h2[text()='My Portfolio']");



    private By  navbarExperienceInternalLinkButton =  By.xpath("//div[@id" +
            "='root']//a[text()='Experience']");

    private  By mySkillsSectionHead = By.xpath("//section[@id='mySkills']//h2" +
            "[text()='My Expertise']");



    private  By resumePage =  By.xpath("//div[@id='root']//nav[contains" +
            "(@class,'navbar')]//li[5]//a[text()='Resume']");

    private  By archivePage =  By.xpath("//div[@id='root']//nav[contains" +
            "(@class,'navbar')]//li[6]//a[text()='Archive']");

    private By hitMeUpSectionInternalLinkButton = By.xpath("//div[@id='root" +
            "']//a[text()='Hit Me Up']");

    private  By contactSection =  By.id("Contact");

    private  By contactSectionHead = By.xpath("//section[@id='Contact']//h2" +
            "[text()='Contact Me']");


    private  By firstNameInput =  By.id("first-name");
    private  By lastNameInput = By.id("last-name");
    private  By emailInput =  By.id("email");
    private  By phoneNumberInput =  By.id("phone-number");
    private  By chooseTopicOption =  By.id("choose-topic");
    private  By messageInput =  By.id("message");
    private  By checkBoxTerms =By.id("checkbox");
    private  By modalContext = By.id("modal-content");
    private  By modaleContentHead = By.xpath("//form[contains(@class," +
            "'modal-content')]//h1[text()='Error']");

    private  By submitFormButton = By.xpath("//form[1]//button[text()" +
            "='Submit']");

    public  void setFirstNameInput(String name){
        set(firstNameInput,name);
    }
    public  void setLastNameInput(String lastname){
        set(lastNameInput,lastname);
    }
    public  void setEmailInput(String email){
        set(lastNameInput,email);
    }
    public  void setPhoneNumberInput(String phoneNr){
        set(phoneNumberInput,phoneNr);
    }
    public  void setChooseTopicOption(String text){
        SelectUtility.selectByVisibleText(chooseTopicOption,text);
    }

    public void setMessageInput(String message){
        set(messageInput,message);
    }
    public  void setCheckBoxTerms(){

         ScrollUtility.scrollToElement(submitFormButton);
        Wait.waitForAnElement(checkBoxTerms,30);
        CheckBoxUtility.selectCheckBox(checkBoxTerms);
    }
    public  void clickSubmitFormButton(){
        ClickUtility.clickJs("//form[1]//button[text()" +
                "='Submit']");
    }

    private  String getText(By locator){
        return  find(locator).getText();
    }
    public String getLastNameInputText() {
        return getText(lastNameInput);
    }

    public String getMessageInputText() {
        return getText(messageInput);
    }

//    public By getModalContext() {
//        return modalContext;
//    }

    public String getModaleContentHeadText() {
        return getText(modaleContentHead);
    }

    public String getFirstNameInputText() {
        return getText(firstNameInput);
    }

    public String getEmailInputText() {
        return getText(emailInput);
    }

    public String getPhoneNumberInputText() {
        return getText(phoneNumberInput);
    }

    public By getChooseTopicOption() {
        return chooseTopicOption;
    }

    public By getCheckBoxTerms() {
        return checkBoxTerms;
    }


    public String getWelcomeHeaderText() {
        return find(welcome_header_text).getText();
    }

    public  void clickViewMyWorkButtonLink(){
        click(viewMyWorkButtonLink);
        ScrollUtility.scrollToElement(myPortfolioWorkSection);

    }

    public  String getMyMyPortfolioWorkSectionHead(){
        return find(myMyPortfolioWorkSectionHead).getText();
    }

    public void clickNavbarExperienceInternalLinkButton(){
        click(navbarExperienceInternalLinkButton);
        ScrollUtility.scrollToElement(mySkillsSectionHead);
    }

    public  String getMySkillsSectionHeadText(){
        return  find(mySkillsSectionHead).getText();
    }


    public  ResumePage goToResumePage(){
        click(resumePage);
        return new ResumePage();
    }

    public  ArchivePage goToArchivePage(){

        click(archivePage);
        return new ArchivePage();
    }

    public  String getContactSectionHeadText(){
        return find(contactSectionHead).getText();
    }
    public  void clickHitMeUpSectionInternalLinkButton(){

        click(hitMeUpSectionInternalLinkButton);
        Wait.waitForAnElement(contactSection,10);
        ScrollUtility.scrollToElement(contactSection);

    }


}

package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.*;

public class Register extends Utils {

    private By yourPersonalDetails = By.className("title");
    private By gender = By.cssSelector("input[id='gender-female']");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList = By.xpath("//select[@name='DateOfBirthMonth']");
    private By yearDropList = By.xpath(("//select[@name='DateOfBirthYear']"));
    private By email = By.id("Email");
    private By companyName = By.id("Company");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");




    public void personalDetails () {
        System.out.println(getTextFromElement(yourPersonalDetails));
        clickOnElement(gender);
        enterText(firstName, "Sonal");
        enterText(lastName,"Patel");
        selectByVisibleText(dayDropList, "10");
        selectByVisibleText(monthDropList,"January");
        selectByVisibleText(yearDropList,"1910");
        enterText(email,"sonal@yahoo.com");
        enterText(companyName,"global");
        enterText(password,"64£017");
        enterText(confirmPassword,"64£017");
    }


    }



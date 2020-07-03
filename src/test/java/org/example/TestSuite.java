package org.example;

import org.junit.Test;

public class TestSuite extends BrowserSetup {

    HomePage homePage = new HomePage();
    Register registerpage = new Register();
    Computers computer = new Computers();


    @Test
    public void openHomePage(){

        homePage.clickOnRegister();
        homePage.getTextOfRegister();
        registerpage.personalDetails();
    }

    @Test
    public void searchField ()
    {
        homePage.searchField();
    }

    @Test
    public void selectCurrency(){
        homePage.selectCurrency();
    }


    @Test
    public void giftCard(){
        homePage.giftCard();
    }

    @Test
    public void clickOnComputers() throws InterruptedException {
        computer.clickOnComputers();
    }


    }








package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utils {

    private By register = By.className("ico-register");
    private By searchText = By.id("small-searchterms");
    private By searchButton = By.cssSelector("[value='Search']");
    private By clickCurrency = By.id("customerCurrency");
    private By selectEuroCurrency = By.xpath("//div[@class='currency-selector']//option[2]");
    private By giftCard = By.cssSelector("div[class='header-menu'] ul li:nth-child(7)");





    public void searchField () {
        enterText(searchText,"Electronics");
        clickOnElement(searchButton);
    }

    public void clickOnRegister() {
        clickOnElement(register);
    }

    public void getTextOfRegister() {
        System.out.println(getTextFromElement(register));
    }
    public void selectCurrency(){
        clickOnElement(clickCurrency);
        clickOnElement(selectEuroCurrency);
       // clickOnElement(giftCard);

    }

    public void giftCard(){
        clickOnElement(giftCard);
    }
}




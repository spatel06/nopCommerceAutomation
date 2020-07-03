package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Computers extends Utils{

    private By click = By.xpath("//a[@href='/computers']");
    private By clickOnDesktops = By.cssSelector("h2 [title='Show products in category Desktops']") ;                      //("//h2[@class='title']//a[1]");

public void clickOnComputers() throws InterruptedException {
    clickOnElement(click);
    Thread.sleep(4000);
    clickOnElement(clickOnDesktops);


}


}

package org.example;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BrowserSetup extends BasePage{

    @Before
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver","src\\resources\\browserDrivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //finish code for driver maximize and implicit wait

    }

    @After
    public void closeBrowser () {
        //driver.close();




        }
    }



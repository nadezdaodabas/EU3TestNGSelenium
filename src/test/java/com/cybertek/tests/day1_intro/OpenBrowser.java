package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {
//we have to enter this line every time we want to open chrome
        //hey webDriverManager,can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();
        //WebDriver represents the browser
        //we are creating driver for chrome drowsier
        //new ChromeDriver()-->this part will pen chrome drowsier
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekshool.com");


    }
}

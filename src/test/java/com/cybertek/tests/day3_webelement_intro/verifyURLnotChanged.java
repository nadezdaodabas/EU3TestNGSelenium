package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.deploy.association.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {

        WebDriver drıver= WebDriverFactory.getDriver("Chrome");
        //open chrome browser
        drıver.get("http://practice.cybertekschool.com/forgot_password");
        //go to http://practice.cybertekschool.com/forgot_password

        String expectedUrl= drıver.getCurrentUrl();
        // save actual url before clicking button

        WebElement retrievePasswordButton = drıver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        //click on Retrieve Password

        String actualUrl= drıver.getCurrentUrl();
        // save actual url after clicking button
        if (expectedUrl.equals(actualUrl)) {
    System.out.println("PASS");
}else {
    System.out.println("FAİL");

    drıver.quit();
    //close your browser

}

    }
}

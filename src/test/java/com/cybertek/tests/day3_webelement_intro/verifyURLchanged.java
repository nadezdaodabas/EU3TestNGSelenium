package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) {
        WebDriver drıver= WebDriverFactory.getDriver("Chrome");
        //open chrome browser
        drıver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailİnputBox = drıver.findElement (By.name ("email"));

        emailİnputBox.sendKeys("cilena10@mail.ru");
        //sendKeys-->send keyboard action to the webelement

        WebElement retrievaPasswordButton=drıver.findElement(By.id("form_submit"));
        retrievaPasswordButton.click();
        //click retrieva password button
        String expectedUrl= "http://practice.cybertekschool.com/email_sent";
        String actualUrl= drıver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAİL");
            System.out.println("expectedURL=" + expectedUrl);
            System.out.println("actualUrl=" + actualUrl);
        }

            drıver.quit();
            //close your browser


        }

    }


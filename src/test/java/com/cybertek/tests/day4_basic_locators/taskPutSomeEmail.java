package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class taskPutSomeEmail {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("nadezda");

        //proper way
        //WebElement emailInput=driver.findElement(By.name("email"));
        //emailInput.sendKeys("cilena1081@gmail.com");
        //lazy way
        driver.findElement(By.name("email")).sendKeys("cilena1081@gmail.com");

        //proper way
        //WebElement singUpClickButton= driver.findElement(By.name("wooden_spoon"));
       // singUpClickButton.click();

        //lazy way
        driver.findElement(By.name("wooden_spoon")).click();
    }



    }




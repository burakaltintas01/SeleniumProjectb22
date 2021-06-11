package com.cybertek.tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        amazonSearchBar.sendKeys("wooden spoon " + Keys.ENTER);

        String expextedTitle = "Amazon.com : wooden spoon";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expextedTitle)){

            System.out.println("title verification passed");
        }else {
            System.out.println("title failed");
        }



    }
}

package com.cybertek.tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class STUDY {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        WebElement glocater = driver.findElement(By.name("q"));
        Thread.sleep(3000);
        glocater.sendKeys("facebook" + Keys.ENTER);
        Thread.sleep(3000);
        WebElement face = driver.findElement(By.cssSelector("a[href='https://www.facebook.com/"));

        //WebElement face = driver.findElement(By.className("LC20lb DKV0Md"));
        face.click();
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("burakaltintas01@gmail.com");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("pass"));
        password.click();
        password.sendKeys("123456" + Keys.ENTER);









    }
}

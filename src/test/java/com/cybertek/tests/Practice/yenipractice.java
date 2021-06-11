package com.cybertek.tests.Practice;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class yenipractice {


    WebDriver driver;

    @Test
    public void Test1() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

        Thread.sleep(2000);
        WebElement Username = driver.findElement(By.id("prependedInput"));
        Username.sendKeys("user22");
        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(3000);


        WebElement samet1 = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        samet1.click();
        WebElement samet = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        samet.click();

        String expectdTitle= "Cars";
        String actualTitle = driver.findElement(By.xpath("//h1[.='Cars']")).getText();

        Assert.assertEquals(expectdTitle,actualTitle);

    }

}

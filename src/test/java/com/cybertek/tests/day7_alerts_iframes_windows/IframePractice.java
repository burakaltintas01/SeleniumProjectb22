package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //Open browser
        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        // 3. Go to: http://practice.cybertekschool.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");


    }
    @Test
    public void iframe_tc1(){

        //#1- changing to iframe by index: we pass index number
        //driver.switchTo().frame(0);

        //#2- Locate as a Web Element to switch
        // We find and locate <iframe> web element from the page.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));

        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //locating header as web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());

    }

}
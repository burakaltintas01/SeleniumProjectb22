package com.cybertek.tests.Practice;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class seq1 {
    WebDriver driver;

    @BeforeMethod
    public void setup_method() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com");
                WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("user39");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        passWord.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginButton.click();
    }

    @Test
    public void resetFunctionalityTest() throws InterruptedException {
        WebElement fleetButton = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetButton.click();

        WebElement vehicleButton = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicleButton.click();

        WebElement gridSetting = driver.findElement(By.xpath("//a[@title='Grid Settings']"));
        gridSetting.click();
        Thread.sleep(2000);

        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//tr[@class='renderable']"));
        for (WebElement eachCheckBox : allCheckBoxes) {
            if(!eachCheckBox.isSelected()) {
                driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                eachCheckBox.click();
                eachCheckBox.click();
                eachCheckBox.click();

            }
            Thread.sleep(2000);
        }

        WebElement closeTab = driver.findElement(By.xpath("//span[@class='close']"));
        closeTab.click();
        Thread.sleep(2000);

        WebElement resetButton = driver.findElement(By.xpath("//a[@title='Reset']"));
        resetButton.click();
    }
}
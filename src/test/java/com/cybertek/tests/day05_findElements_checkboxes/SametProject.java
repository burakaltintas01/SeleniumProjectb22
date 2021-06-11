package com.cybertek.tests.day05_findElements_checkboxes;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SametProject {
    public static void main(String[] args) throws InterruptedException {
        /*AC 9: - Samet
RAINY DAY SCENARIO 2
- given I am a sales manager and
							username: salesmanager1375
							password: UserUser123
- given I am on the Vytrack login page :
		https://docs.google.com/spreadsheets/d/1iUbBEvm9x36BvPFY1ve8lre8iB9vgtK0mQ9WmIatjeY/edit?usp=sharing
- when I enter the correct username: salesmanager1375
- and I enter correct password: UserUser123
- and I click the login button
- then I should see an ERROR message dispayed on the page, that: Invalid user name or password.

         */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        String title = "Login";
        String actualTitle = driver.getTitle();

        if(title.equals(actualTitle)){
            System.out.println("Title Verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
        }
       Thread.sleep(5000);
        WebElement Username = driver.findElement(By.id("prependedInput"));
        Username.sendKeys("salesmanager1375");
        Thread.sleep(5000);
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123"+ Keys.ENTER);

       WebElement displayMessage = driver.findElement(By.xpath("//div[.='Invalid user name or password.']"));
        System.out.println("display message = " + displayMessage.getText());


    }
}

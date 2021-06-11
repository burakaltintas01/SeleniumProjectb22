package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerificiation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        WebElement inputUsername = driver.findElement(By.id("email"));
        WebElement inputPassword = driver.findElement(By.id("pass"));
        Thread.sleep(3000);
        inputUsername.sendKeys("something@gmail.com" + Keys.ENTER);

        String newTitle = driver.getTitle();
        String expectedTitle = "Log Into Facebook";
        Thread.sleep(5000);
        if(newTitle.equals(expectedTitle)) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        System.out.println(newTitle);
    }
}

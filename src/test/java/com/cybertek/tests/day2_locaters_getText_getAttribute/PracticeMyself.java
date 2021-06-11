package com.cybertek.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMyself {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement Title = driver.findElement(By.className("brand"));
        // String title1 = Title.getText();


        String ExpectedTitle = "Zero Bank";
        if(Title.getText().equals(ExpectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }

        driver.quit();


    }
}

package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver() ;

        driver.get("https://www.yahoo.com");
        String ExpectedTitle = "Yahoo";
        System.out.println("Current Title = " + driver.getTitle());
        // Creating our verification

        if(ExpectedTitle.equals(driver.getTitle())){
            System.out.println("Title is as expected . Verification Passed");

            driver.close();
        }
    }
}

package com.cybertek.tests.day2_locaters_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekUrlVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String actualUrl = "https://practice.cybertekschool.com";

        if (actualUrl.contains("cybertekschool")) {
            System.out.println("passed");
        }

        System.out.println(driver.getTitle());

        if (driver.getTitle().equals("practice")) {
            System.out.println("Title Passed");
        } else {
            System.out.println("Title failed");

            System.out.println(driver.getCurrentUrl());

            driver.quit();
        }
    }
}
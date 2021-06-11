package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekSchool_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String actualUrl = "https://practice.cybertekschool.com";

        if(actualUrl.contains("cybertekschool")) {
            System.out.println("passed");
        }

        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("practice")) {
            System.out.println("Title Passed");
        }else{
            System.out.println("Title failed");

            driver.quit();

        }
    }
}

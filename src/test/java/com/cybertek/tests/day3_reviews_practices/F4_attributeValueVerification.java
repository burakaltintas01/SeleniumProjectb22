package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_attributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement createPageLink  = driver.findElement(By.className("_8esh"));

        String ct = createPageLink.getText();

        String expectedPageLink = "Create a Page";

        if(expectedPageLink.equals(ct)){
            System.out.println("pass");

            driver.quit();
        }

    }
}

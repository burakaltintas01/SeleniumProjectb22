package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        // down here , its location the web element------><---- then click->
        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(expectedInTitle.equals(actualTitle)) {
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("title verification FAILED");
        }

            String expectedGoogleTitle = "Google";
            String actualGoogleTitle = driver.getTitle();

            if(expectedInTitle.equals(actualTitle)) {
                System.out.println("Title verification PASSED");
            }else{
                System.out.println("Title verification FAILED");
            }

            //Driver.findElement(By.partialLinkText("") this finds exact words , make sure what text is passed is unique
                // this method is like .contains in java

    }


}

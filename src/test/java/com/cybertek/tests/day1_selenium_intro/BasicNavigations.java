package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1 - set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - create instance of selenium web driver

        WebDriver driver = new ChromeDriver();

        //3 Test if driver is working
        driver.get("https://www.tesla.com");
        System.out.println("Current title - "+driver.getTitle());

        System.out.println("It will print out the last Url- "+driver.getCurrentUrl());

        //Putting 3 seconds of wait/ stops the code for 3 seconds
        Thread.sleep(3000);
        // Going back using navigations
        driver.navigate().back();
        //to refresh
        Thread.sleep(3000);
        //going forward
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();
        //to go to different site using .to() method
        driver.navigate().to("https://google.com");

        System.out.println("Current title - "+driver.getTitle());

        System.out.println("It will print out the last Url- "+driver.getCurrentUrl());
        Thread.sleep(2000);
        // This will maximize the browser page
        driver.manage().window().maximize();
        // This will close the currently focused page or tab
        Thread.sleep(2500);
        driver.close();

        // this will close all of the opened browsers or tabs within the same session.
       // driver.quit();
    }
}


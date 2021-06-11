package com.cybertek.tests.Practice.utilities;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {


    public static void sleep(int second) throws InterruptedException {
        second*=1000;

        Thread.sleep(second);

    }
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library1.cybertekschool.com/login.html");

    }


    @Test
    public void login_link_count_test(){
        //Task #1: Library software link verification
        //loginMethod calling to login Library app
        LibraryUtils.loginToLibrary(driver);

        //6. Print out count of all the links on landing page

        try {
            BrowserUtils.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        //7. Print out each link text on this page

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }

    }

}

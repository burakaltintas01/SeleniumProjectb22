package com.cybertek.tests.day05_findElements_checkboxes;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        //if web element is not foind, this will wait up to given second
        //if web element has been found, it won't wait and move it.
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        List<WebElement> ListOfLinks =driver.findElements(By.xpath("//body//a"));
        int count =0;
        for(WebElement each : ListOfLinks){
        count++;
            System.out.println(each.getText());
        }
        System.out.println("number of links " + count);

        //iter + tab = shortcut foreach loop
        // fori + tab = shortcut for loop

        int numberoflinks = ListOfLinks.size();

        System.out.println("number of links = " + numberoflinks);

    }
}

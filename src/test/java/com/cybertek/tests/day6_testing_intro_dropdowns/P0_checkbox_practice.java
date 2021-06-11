package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_checkbox_practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
        /*driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement chkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1 is selected = " + chkbox1.isSelected());

        WebElement chkbox2 = driver.findElement(By.id("box2"));
        System.out.println("check box 2 is selected = " + chkbox2.isSelected()); This is with By.id */

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        System.out.println("checkbox1 is selected = " + checkbox1.isSelected());
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        System.out.println("checkbox2 is selected = " + checkbox2.isSelected());

        driver.quit();
    }
}

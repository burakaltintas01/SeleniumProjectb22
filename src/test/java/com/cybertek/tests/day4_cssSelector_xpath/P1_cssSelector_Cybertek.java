package com.cybertek.tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
       /* 1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        f. “Powered by Cybertek School” text
        4. Verify all WebElements are displayed*/

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement headerTag = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));



        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        System.out.println("headerTag.isDisplayed() = " + headerTag.isDisplayed());

        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());

        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());

        //driver.findElement(By.xpath("html/body/nav/ul/li/a"));

        //a=@id ='uh7']
        //a=@[name = 'bb05'];
        driver.quit();

    }
}

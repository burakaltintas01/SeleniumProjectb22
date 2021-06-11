package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //Open browser
        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //3. Click to “Click for JS Alert” button

        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //4. Click to OK button from the alert
        informationAlertButton.click();

        //Switching driver's focus to alert, so we can handle it
        Alert alert = driver.switchTo().alert();

        //Switching driver's focus to alert, so we can handle it
        alert.accept();


        //5. Verify “You successfuly clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed(), " Result text is NOT displayed on the page");

        String expectedText = "You successfuly clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected");

    }
    @Test
    public void TC1() {

        //TC #2: Confirmation alert practice
        // Open browser
        // Go to website: http://practice.cybertekschool.com/javascript_alerts.
        driver.get("http://practice.cybertekschool.com/javascript_alerts");


        // Click to “Click for JS Confirm” button
        WebElement JSConfrim = driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]"));
        JSConfrim.click();
        // Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // .Verify “You clicked: Ok” text is displayed.
        WebElement ok = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedResult = "You clicked: Ok";
        String actualResult = ok.getText();

        Assert.assertEquals(expectedResult, actualResult);
        Assert.assertTrue(ok.isDisplayed());


    }
    @Test
    public void TC2() throws InterruptedException {

        //TC #3: Information alert practice
        //1 . Open browser

        //2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        //3. Click to “Click for JS Prompt” button
        WebElement js= driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]"));
        js.click();
        //4. Send “hello” text to alert
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
   //     alert.accept();
        //5. Click to OK button from the alert
        alert.accept();
        //6  . Verify “You entered: hello” text is displayed.*/
        WebElement verify= driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You entered: hello";
        String actuall = verify.getText();

        Assert.assertEquals(expected,actuall , "let me know if it fails");

    }
}

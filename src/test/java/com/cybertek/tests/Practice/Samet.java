package com.cybertek.tests.Practice;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Samet {

        WebDriver driver;


    //"1.Verify that truck driver should be able to see all cars' cost informations on the Vehicle Costs
    //page.
    //2.Verify that truck driver should be able to create Vehicle cost an cancel it.
    //3.Verify that truck driver should be able to edit or delet Vehicle cost
    //4. Verify that truck driver should be able to add Attachement on General information
    //page by click on any of the car on the grid.
    //
    //6.Verify that truck driver should be able to reset the grid by click on Grid setting
    // "

        @Test
        public void Test1() throws InterruptedException {

            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
            driver.get("https://qa3.vytrack.com/user/login");

            Thread.sleep(2000);
            WebElement Username = driver.findElement(By.id("prependedInput"));
            Username.sendKeys("user39");
            Thread.sleep(2000);
            WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
            passWord.sendKeys("UserUser123" + Keys.ENTER);
            Thread.sleep(3000);


            WebElement samet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
            samet.click();
            Thread.sleep(3000);
            WebElement burak = driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
            burak.click();

            String expectedTitle = "Vehicle Costs";
            String actualTitle = driver.findElement(By.xpath("//h1[.='Vehicle Costs']")).getText();

            Assert.assertEquals(expectedTitle, actualTitle);

            // Select stateDropdown = new Select(driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1']")));
            //Thread.sleep(7000);
            //stateDropdown.selectByVisibleText("Vehicles");
            //stateDropdown.selectByVisibleText("Vehicle Costs");

            Thread.sleep(2000);
            WebElement CVC = driver.findElement(By.xpath("//a[@title='Create Vehicle Costs']"));
            Thread.sleep(2000);
            CVC.click();
            WebElement kamran = driver.findElement(By.xpath("//span[@class='select2-chosen']"));
            kamran.click();
            Thread.sleep(2000);
            Select select = new Select(driver.findElement(By.xpath("//select[contains(@id,'custom_entity')]")));
            select.selectByVisibleText("Summer tires");
            Thread.sleep(2000);

           /* WebElement typeChosen = driver.findElement(By.id("s2id_custom_entity_type_Type-uid-60b9bdd32daeb"));
            Thread.sleep(2000);
            typeChosen.click();
            Thread.sleep(2000);*/


            WebElement totalPrice = driver.findElement(By.xpath("//input[contains(@id,'custom_entity')]"));
            Thread.sleep(2000);
            totalPrice.sendKeys("500");

            WebElement date = driver.findElement(By.xpath("//input[contains(@placeholder,'Choose a date')]"));
            date.click();
            Thread.sleep(2000);

            WebElement date1 = date.findElement(By.xpath("//a[@class='ui-state-default']"));
            date1.click();
            Thread.sleep(2000);

            WebElement costD = driver.findElement(By.name("custom_entity_type[CostDescriptions]"));
            costD.sendKeys("This area is for description");
            Thread.sleep(3000);

            WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
            save.click();
            Thread.sleep(4000);
            //To cancel;
            //WebElement toCancel = driver.findElement(By.xpath("//a[@title='Cancel']"));



           // WebElement vCost = driver.findElement(By.xpath("//a[text()='Vehicle Costs']"));
            //Thread.sleep(2000);
            //vCost.click();
            Thread.sleep(2000);

                // down here to cancel after saving
            WebElement deleteDropDown = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[4]"));
            deleteDropDown.click();
            deleteDropDown.click();
            Thread.sleep(3000);

            WebElement delete = driver.findElement(By.xpath("//div[@style='z-index: 2; display: none;']"));
            Thread.sleep(2000);
            delete.click();

            Thread.sleep(2000);


            driver.quit();




        }
}



package com.cybertek.tests.Day10_webtable_properties_practices;

import com.cybertek.tests.Practice.utilities.TableUnits;
import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import com.cybertek.tests.day9_properties_browser_utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : chrome

        String url = ConfigurationReader.getProperty("dataTablesUrl");
        //This line returns String : http://practice.cybertekschool.com/tables#edit

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        // below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTablesUrl"));

    }

    @Test
    public void task3_return_tims_due_amount() {

        ////table[@id='table1']//td[.='Tim'] --> this locator locates Tim's cell regardless
        // of which row he is in

        //2.	Locate first table and verify Tim has due amount of “$50”

        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]
        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tim's cell is not returning as expected.");


    }

    @Test
    public void task4_verify_order_method(){

        TableUnits.verifyOrder(driver, "Tim");

    }

    @Test
    public void task5_print_all_names_and_emails(){

        TableUnits.printNamesAndEmails(driver);

    }

}
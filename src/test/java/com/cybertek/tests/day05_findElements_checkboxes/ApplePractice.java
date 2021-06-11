package com.cybertek.tests.day05_findElements_checkboxes;

import com.cybertek.tests.day4_cssSelector_xpath.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplePractice {

    /*1.Open Chrome browser

   2.Go to https://www.apple.com
   3.Click to iPhone
   4.Print out the texts of all links
   5. Print out how many link is missing text
   6.Print out how many link has text
   7.Print out how many total link
     */
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.apple.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Apple = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));

        Apple.click();

        List<WebElement> ListOfLinks =driver.findElements(By.xpath("//body//a"));

        for(WebElement eachLink : ListOfLinks){
            System.out.println(eachLink.getText());


        }


        System.out.println("BUUUUURRAAAAAAK");
        int count = 0;
        for(WebElement eachLink : ListOfLinks){
            count++;
            if(eachLink.getText()==""){
                System.out.println("////" + eachLink);
            }

        }
        System.out.println("number of links = " + count);
        System.out.println("size of links " + ListOfLinks.size());


        driver.quit();









    }
}

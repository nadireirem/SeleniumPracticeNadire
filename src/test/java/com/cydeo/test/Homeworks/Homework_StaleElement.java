package com.cydeo.test.Homeworks;

import com.cydeo.test.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Homework_StaleElement {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open a chrome browser
        WebDriver driver= DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //        2. Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest ");

        //        3. Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink=driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("Before refreshing " + cydeoLink.isDisplayed());


        //        4. Refresh the page.
driver.navigate().refresh();
Thread.sleep(2000);

        //        5. Verify it is displayed, again.
        cydeoLink=driver.findElement(By.xpath("//a[@target='_blank']"));

            System.out.println("After refreshing the page: " + cydeoLink.isDisplayed());


            System.out.println("StaleElementReferenceException is thrown");



        }
}

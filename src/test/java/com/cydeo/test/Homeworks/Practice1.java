package com.cydeo.test.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.security.Key;

public class Practice1 {
    public static void main(String[] args) throws InterruptedException {
        // Back and forth navigation
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        
        //2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement gmail=driver.findElement(By.linkText("Gmail"));

       // 3- Click to Gmail from top right.
        gmail.sendKeys("Gmail"+ Keys.ENTER);

       // 4- Verify title contains:
        //Expected: Gmail

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

       // 6- Verify title equals:
       // Expected: Google
        expectedTitle = "Google";
        actualTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title passed");
        }else{
            System.out.println("Title failed");
        }

        driver.quit();
        
        
        
    }

}

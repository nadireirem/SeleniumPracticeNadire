package com.cydeo.test.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOfficeHours {
    /*
    1- Open a chrome browser
	2- Go to: https://practice.cydeo.com/
	3- Click to Multiple Buttons   (by using linkText locator)
	4- Verify title equals:
	   Expected: Multiple Buttons
	5- Go back to home page by using the .back();
	6- Verify title equals:
	   Expected: Practice
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");
        WebElement multipleButton= driver.findElement(By.linkText("Multiple Buttons"));
        multipleButton.click();
        Thread.sleep(2000);
        String expectedTitle= "Multiple Buttons";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        driver.navigate().back();
        Thread.sleep(2000);
        expectedTitle="Practice";
        actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

driver.quit();


    }
}

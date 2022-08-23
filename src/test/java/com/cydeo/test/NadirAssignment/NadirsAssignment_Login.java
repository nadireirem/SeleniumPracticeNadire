package com.cydeo.test.NadirAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NadirsAssignment_Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/stream/");


        // WebElement header = driver.findElement(By.className("log-popup-header"));
        WebElement header = driver.findElement(By.cssSelector("div.log-popup-header"));
        String exceptedHeader = "Authorization";
        String actualHeader = header.getText();
        if (exceptedHeader.equals(actualHeader)) {
            System.out.println("Header text test is passed");
        } else {
            System.out.println("Header text test is failed");
        }

        WebElement userName= driver.findElement(By.cssSelector("input[type='text']"));
        userName.sendKeys("helpdesk34@cybertekschool.com" );


        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("UserUser");


        WebElement login=driver.findElement(By.className("login-btn"));
        login.click();

      /*     expectedTitle="Portal";
        actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

       */



        WebElement userBlock=driver.findElement(By.id("user-block"));
        userBlock.click();
        WebElement logOut=driver.findElement(By.className("menu-popup-item-text"));
        logOut.click();







driver.quit();




    }
}

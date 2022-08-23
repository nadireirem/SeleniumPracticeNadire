package com.cydeo.test.Homeworks;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Etsy Title Verification
      //  1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // 2. Go to https://www.etsy.com
        driver.get("https://etsy.com");
        String actualTitle=driver.getTitle();
        String expectedTitle = "Etsy";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

       // 3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        Thread.sleep(3000);

       // 4. Verify title:

       // Expected: "Wooden spoon | Etsy"

        expectedTitle = "Wooden spoon | Etsy";
        actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        driver.quit();
    }
}

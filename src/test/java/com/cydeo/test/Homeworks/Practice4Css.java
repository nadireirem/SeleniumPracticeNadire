package com.cydeo.test.Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4Css {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchBox=driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        WebElement cydeoText=driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));

        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo Text test is passed");
        }else {
            System.out.println("Cydeo Text test is passed");
        }


        driver.quit();

    }
}

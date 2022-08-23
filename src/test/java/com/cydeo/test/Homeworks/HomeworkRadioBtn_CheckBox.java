package com.cydeo.test.Homeworks;

import com.cydeo.test.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkRadioBtn_CheckBox {
    public static void main(String[] args) throws InterruptedException {
        //1. Go to https://www.etsy.com
        WebDriver driver= DriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com ");

        //2. Search for “wooden spoon”
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        //3. Click on filters
        WebElement filter=driver.findElement(By.xpath("//span[@class='wt-hide-xs wt-show-md filter-expander']"));
        filter.click();
        //4. Select free shipping, on sale
        WebElement freeShippingBtn=driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        freeShippingBtn.click();

        WebElement onSaleBtn=driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        onSaleBtn.click();


        //5. Select under $25 Click on apply filters
WebElement priceBtn=driver.findElement(By.xpath("//label[@for='price-input-1']"));
priceBtn.click();

WebElement applyBtn=driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']"));
applyBtn.click();

Thread.sleep(3000);


        //6. Print count of results
        WebElement results=  driver.findElement(By.xpath("//span[contains(text(),'results,')]"));
        Thread.sleep(2000);
        System.out.println(results.getText());
        driver.quit();


    }
}

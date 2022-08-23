package com.cydeo.test.Homeworks;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework_Iframe extends TestBase {
    @Test
    public void locateIframe(){


        //1. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

        //2. Assert: “Your content goes here.” Text is displayed.
        WebElement iframe=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
WebElement textArea=driver.findElement(By.xpath("//body[@class='mce-content-body ']"));
     //   String expectedText="Your content goes here.";
       // String actualText=textArea.getText();
        //ystem.out.println("textArea.isDisplayed() = " + textArea.isDisplayed());

        Assert.assertTrue(textArea.isDisplayed(),"Text is not displayed!");

        //3. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        driver.switchTo().defaultContent();
        WebElement headerText= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed()," not dispayed ");


    }

}

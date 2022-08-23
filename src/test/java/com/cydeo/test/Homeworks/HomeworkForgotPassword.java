package com.cydeo.test.Homeworks;

import com.cydeo.test.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkForgotPassword {
    public static void main(String[] args) throws InterruptedException {
      //  TC #3: Practice Cydeo/ForgotPassword URL verification
     //   1. Open Chrome browser


      WebDriver driver=DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //  2. Go to http://practice.cydeo.com/forgot_password
        driver.get("http://practice.cydeo.com/forgot_password");

        //  3. Enter any email into input box
        WebElement inputBox= driver.findElement(By.cssSelector("input[type='text']"));
        inputBox.sendKeys("irem@cydeo.com");

        //  4. Click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        retrievePassword.click();
        Thread.sleep(2000);

        //   5. Verify URL contains:
        //   Expected: “email_sent”
      String expURL = "email_sent";
      String actualURL = driver.getCurrentUrl();

      if (actualURL.contains( expURL )) {
        System.out.println(  "passed" );
      } else {
        System.out.println( "failed" );
      }



        //   6. Verify textbox displayed the content as expected.
        //           Expected: “Your e-mail’s been sent!”
        //    Hint: You need to use getText method for this practice.
      WebElement textBox=driver.findElement(By.name("confirmation_message"));
      String expectedMsg="Your e-mail's been sent!";
      String actualMsg=textBox.getText();


      if(actualMsg.contains(expectedMsg)){
        System.out.println("passed");
      }else{
        System.out.println("failed");
      }

driver.quit();
    }
}

package com.cydeo.test.NadirAssignment;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestCase1 extends TestBase {
    @Test
    public void testUserStory1()  {
//"1. Verify users can login
driver.get("https://login2.nextbasecrm.com/");


//2. verify users can check ""Remember me on this computer"" option
        WebElement rememberMeBtn= driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("rememberMeBtn.isSelected() = " + rememberMeBtn.isSelected());



        rememberMeBtn.click();
        System.out.println("rememberMeBtn.isSelected() = " + rememberMeBtn.isSelected());



//3. Verify users can access to ""FORGOT YOUR PASSWORD?"" link page
        WebElement forgotPasswordBtn=driver.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        forgotPasswordBtn.click();


        driver.navigate().back();

        WebElement userLogin= driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        //helpdesk34@cybertekschool.com
          userLogin.sendKeys("helpdesk34@cybertekschool.com");

        WebElement password=driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        WebElement loginBtn=driver.findElement(By.cssSelector("input.login-btn"));
        loginBtn.click();
//2. As a user, I should be able to send message.
        //"1. Verify users can send message by clicking ""MESSAGE"" tab

        WebElement messageBtn=driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        messageBtn.click();

          //  driver.switchTo().frame(driver.findElement(By.xpath("//body[@contenteditable='true']")));
        WebElement messageBox=driver.findElement(By.xpath("//body[@contenteditable='true']"));

        messageBox.sendKeys("Test01");





        //2. Verify users can cancel message.
        WebElement cancelBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-cancel']"));
        cancelBtn.click();

        //3. Verify users can attach link by clicking on the link icon."



//"3. As a user, I should be able to search people, document and more from search box"
            //"1. Verify users can search a valid info from dearch box. (employee, doc, post, etc)
            //2. Verify users get menu item and suggested modules when they type in the box.



            //helpdesk34@cybertekschool.com
         //   userLogin.sendKeys("helpdesk34@cybertekschool.com");
        //  password.sendKeys("UserUser");
        //  loginBtn.click();



//hr33@cybertekschool.com
  //      userLogin.sendKeys("hr33@cybertekschool.com");
   //     password.sendKeys("UserUser");
  //      loginBtn.click();
//hr34@cybertekschool.com
  //      userLogin.sendKeys("hr34@cybertekschool.com");
   //     password.sendKeys("UserUser");
   //     loginBtn.click();

        //marketing33@cybertekschool.com
     //   userLogin.sendKeys("marketing33@cybertekschool.com");
     //   password.sendKeys("UserUser");
     //   loginBtn.click();
        //marketing34@cybertekschool.com
      //  userLogin.sendKeys("marketing34@cybertekschool.com");
     //   password.sendKeys("UserUser");
      //  loginBtn.click();









    }


}

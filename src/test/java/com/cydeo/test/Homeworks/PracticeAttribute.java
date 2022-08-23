package com.cydeo.test.Homeworks;

import com.cydeo.test.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAttribute {
    /*
    TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes



PS: Inspect and decide which locator you should be using to locate web
elements.
     */
    public static void main(String[] args) {


    WebDriver driver = DriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMe = driver.findElement(By.cssSelector("label[class='login-item-checkbox-label']"));

        String expectedText = "Remember me on this computer";
        String actualText = rememberMe.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Remember me label text verification passed!");
        }else{
            System.out.println("Remember me label text verification failed!");
        }

        WebElement forgotPass=driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        String expectedForgotPassText = "FORGOT YOUR PASSWORD?";
        String actualForgotPassText = forgotPass.getText();

        if(actualForgotPassText.equals(expectedForgotPassText)){
            System.out.println("Forgot password text verification passed!");
        }else{
            System.out.println("Forgot password text verification failed!");
        }


        WebElement forgotPassHref=driver.findElement(By.cssSelector("a[class='login-link-forgot-pass']"));
        //"a[href='/?forgot_password=yes']"


        if(forgotPassHref.getAttribute("href").contains("forgot_password=yes")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    /*    String expectedForgotPassHref = "forgot_password=yes";
        String actualForgotPassHref = forgotPass.getText();


        if(actualText.equals(expectedText)){
            System.out.println("Forgot password href verification passed!");
        }else{
            System.out.println("Forgot password href verification failed!");
        }


      */
        driver.quit();




    }
 }
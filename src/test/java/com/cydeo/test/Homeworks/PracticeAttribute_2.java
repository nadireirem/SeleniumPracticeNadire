package com.cydeo.test.Homeworks;

import com.cydeo.test.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeAttribute_2 {
    /*
    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
     */
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

      //  3- Enter incorrect username into login box:
        WebElement loginBox=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginBox.sendKeys("abcdef");
        //4- Click to `Reset password` button
        WebElement resetPass=driver.findElement(By.cssSelector("button.login-btn"));
        resetPass.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        WebElement errorLabel=driver.findElement(By.cssSelector("div[class='errortext']"));
        String expectedErrorMsg="Login or E-mail not found";
        String actualErrorMsg=errorLabel.getText();


        if(actualErrorMsg.equals(expectedErrorMsg)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
driver.quit();
    }


}

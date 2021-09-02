package com.cybertek.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignment {
    public static void main(String[] args) throws Exception{
        /*
        1. Open Chrome and Navigate to https://facebook.com
2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the Login button and wait few seconds until error comes back
5. Navigate back to login screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
8. Click on the search button
9. Click on the cancel button
10. Quit the browser

         */
        // setup the browser
        WebDriverManager.chromedriver().setup();
        // create an object
        WebDriver driver=new ChromeDriver();
        // navigate to the browser
        driver.get("https://facebook.com");

        WebElement loginBox= driver.findElement(By.id("email"));
        loginBox.sendKeys("invalid username");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("some password");
        WebElement logInButton= driver.findElement(By.name("login"));
        logInButton.submit();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement forgotPass=driver.findElement(By.partialLinkText("Forgot Password?"));
        forgotPass.click();
        WebElement mobile=driver.findElement(By.id("identify_email"));
        mobile.sendKeys("1234567");
        WebElement search=driver.findElement(By.id("did_submit"));
        search.click();
        Thread.sleep(3000);
        WebElement cancel=driver.findElement(By.partialLinkText("Cancel"));
        cancel.click();
        driver.quit();


    }
}

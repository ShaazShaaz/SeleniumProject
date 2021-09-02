package com.cybertek.day2_locators_Practice_ByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.interpreter.BytecodeJsr;

public class FindByID_byName_BYLinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        // click on first link "A/B Testing"
        WebElement firstLink= driver.findElement(By.linkText("A/B Testing"));
        firstLink.click();
        // can also give directly driver.findElement(By.linkText("A/B Testing")).click();


        // navigate back to homepage
        driver.navigate().back();
        driver.manage().window().maximize();
        // click on second link
       // driver.findElement(By.linkText("add/remove elements")).click();
        WebElement addOrRemove=driver.findElement(By.partialLinkText("Add/Remove"));
        addOrRemove.click();
        // click on "Home" link to go back home
        driver.findElement(By.linkText("Home")).click();

        // click on "Redirect Link"
        driver.findElement(By.linkText("Redirect Link")).click();





    }
}

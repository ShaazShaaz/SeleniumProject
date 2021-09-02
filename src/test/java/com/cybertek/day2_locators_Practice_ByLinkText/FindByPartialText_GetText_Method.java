package com.cybertek.day2_locators_Practice_ByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetText_Method {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        // identify the link with text"Disappearing Elements "
        WebElement myLink= driver.findElement(By.partialLinkText("Disappearing"));
       // System.out.println(myLink.getText()); returns string= full text
        String fulltext=myLink.getText();
        System.out.println(fulltext);

        // what if I just provide partial link as A
        // it will return the first that matches the criteria
        WebElement aLink= driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());
        driver.quit();


    }
}

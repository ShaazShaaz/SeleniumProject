package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_Html_File {
    public static void main(String[] args) {
        // setup chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // navigate to a local file
        //file:///Users/olcaysenol/Desktop/HTML_Class/Day2.html
        driver.get("file:///Users/olcaysenol/Desktop/HTML_Class/Day2.html");

       // driver.quit();
    }
}

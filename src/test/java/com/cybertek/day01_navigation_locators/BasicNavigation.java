package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        // create chromeDriver object
        WebDriver driver=new ChromeDriver();
        // navigate to https://yahoo.com
        driver.get("https://amazon.com");
        /* navigation methods: using
        - get("url")
        - navigate().to("url")
        - navigate().back()
        navigate().forward()
        navigate().refresh()

        navigate to google.com:
         */
        driver.navigate().to("https://google.com");
        // navigate back
        driver.navigate().back();
        // navigate forward
        driver.navigate().forward();
        // refresh
        driver.navigate().refresh();

        // 2 ways to close browser: close() method for current tab
        // : quit() method for all tabs if there r more than one
        driver.quit();


    }
}

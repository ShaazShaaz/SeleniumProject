package com.cybertek.day2_locators_Practice_ByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        // get all the links that have partial text A in it
        List<WebElement> allLinks = driver.findElements(By.partialLinkText("Dy"));
        // get the size of list first to know how many links with A
        System.out.println("allLinks.size() = " + allLinks.size());
// get the 1st item
        WebElement firstItem=allLinks.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());
        WebElement secondItem=allLinks.get(1);
        System.out.println("secondItem.getText() = " + secondItem.getText());

        // iterate over whole list and print out the text

        for (WebElement each:allLinks) {
            System.out.println("each.getText() = " + each.getText());
        }
        // find element method will throw exception when it cannot find element
        // findElements will return empty list
        driver.quit();
    }
}

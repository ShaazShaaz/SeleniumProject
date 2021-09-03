package com.cybertek.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework1 {
    /*
     navigate to https://google.com
2. search for `selenium`
3. click google search button
4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
5. get the text of that element
6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into
 long variable OPTIONALLy
7. get all the link that contain text `selenium` into a List<WebElement>
8. get the count
9. get the first one text
10. get the last one text
11. iterate over the list and print the text of each link
12. watch the short to learn more about `findElement(By.tagName("tag here"))`
13. watch the short to learn more about `element.getAttribute("attribute goes here")`
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("Selenium");
        driver.findElement(By.name("btnK")).submit();

        WebElement resultCount= driver.findElement(By.id("result-stats"));
        System.out.println("resultCount.getText() = " + resultCount.getText());

        String str=resultCount.getText();
        String str2=str.substring(str.indexOf("1"),str.indexOf(" r"));
        System.out.println(str2);

       // int searchNum=Integer.parseInt(str2);
       // System.out.println(searchNum);

        List<WebElement> selenium=driver.findElements(By.partialLinkText("Selenium"));
        System.out.println("selenium = " + selenium);
        System.out.println("selenium.get(0).getText() = " + selenium.get(0).getText());
        System.out.println("selenium.get(selenium.size()-1).getText() = " + selenium.get(selenium.size() - 1).getText());

        for (WebElement each:selenium) {
            System.out.println("each.getText() = " + each.getText());

        }
        // driver.quit();

    }



}

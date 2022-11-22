package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            ChromeOptions options = new ChromeOptions();
            options.addArguments("headless");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.wikipedia.org/");
            driver.findElement(By.id("searchInput")).sendKeys("puppies");
            driver.findElement(By.className("pure-button-primary-progressive")).click();
            System.out.println(driver.getTitle());            
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

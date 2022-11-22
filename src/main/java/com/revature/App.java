package com.revature;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-headless");
        WebDriver driver = new FirefoxDriver(options); 
        try{
            driver.get("https://www.wikipedia.org/");
            driver.findElement(By.id("searchInput")).sendKeys("puppies");
            driver.findElement(By.className("pure-button-primary-progressive")).click();
            System.out.println(driver.getTitle());   
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(scrFile, new File("screenshot.png"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

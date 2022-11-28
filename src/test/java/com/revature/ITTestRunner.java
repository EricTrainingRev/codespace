package com.revature;


import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/revature/example.feature", glue = "com.revature")
public class ITTestRunner {
    public static WebDriver driver;
    public static FirefoxOptions options;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup(){
        // System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        options = new FirefoxOptions();
        options.addArguments("-headless");
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
    
}

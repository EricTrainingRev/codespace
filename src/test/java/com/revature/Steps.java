package com.revature;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    /*
     * BACKGROUND
     */

    @Given("The user is on the calculator home page")
    public void the_user_is_on_the_calculator_home_page() {
        ITTestRunner.driver.get("https://erictrainingrev-curly-space-fiesta-5jqx576645qcrp4-5500.preview.app.github.dev/docs/index.html");
    }

    /*
     * ADD SCENARIO
     */

    @When("The user provides two numbers to add")
    public void the_user_provides_two_numbers_to_add() {
        ITTestRunner.driver.findElement(By.id("numOne")).sendKeys("1");
        ITTestRunner.driver.findElement(By.id("numTwo")).sendKeys("2");
    }

    @When("The user clicks the add button")
    public void the_user_clicks_the_add_button() {
        ITTestRunner.driver.findElement(By.id("add")).click();
    }

    @Then("The user should get an alert with the numbers added together")
    public void the_user_should_get_an_alert_with_the_numbers_added_together() {
        String result = ITTestRunner.driver.findElement(By.id("result")).getText();
        File scrFile = ((TakesScreenshot)ITTestRunner.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileHandler.copy(scrFile, new File("add_screenshot.png"));
        }catch (IOException e){
            Assert.fail("creating an add screenshot failed");
        }
        Assert.assertEquals("3", result);
    }

    /*
     * SUBTRACT SCENARIO
     */

    @When("The user provides two numbers to subtract")
    public void the_user_provides_two_numbers_to_subtract() {
        ITTestRunner.driver.findElement(By.id("numOne")).sendKeys("8");
        ITTestRunner.driver.findElement(By.id("numTwo")).sendKeys("4");
    }

    @When("The user clicks the subtract button")
    public void the_user_clicks_the_subtract_button() {
        ITTestRunner.driver.findElement(By.id("subtract")).click();
    }

    @Then("The user should get an alert with the numbers subtracted")
    public void the_user_should_get_an_alert_with_the_numbers_subtracted() {
        String result = ITTestRunner.driver.findElement(By.id("result")).getText();
        File scrFile = ((TakesScreenshot)ITTestRunner.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileHandler.copy(scrFile, new File("subtract_screenshot.png"));
        }catch (IOException e){
            Assert.fail("creating a subtract screenshot failed");
        }
        Assert.assertEquals("4", result);
    }

}

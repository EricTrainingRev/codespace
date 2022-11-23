package com.revature;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    /*
     * BACKGROUND
     */

    @Given("The user is on the calculator home page")
    public void the_user_is_on_the_calculator_home_page() {
        ITTestRunner.driver.get("https://erictrainingrev.github.io/codespace/");
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
        ITTestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String result = ITTestRunner.driver.switchTo().alert().getText();
        ITTestRunner.driver.switchTo().alert().accept();
        Assert.assertEquals("3", result);
    }

    /*
     * SUBTRACT SCENARIO
     */

    @When("The user provides two numbers to subtract")
    public void the_user_provides_two_numbers_to_subtract() {
        ITTestRunner.driver.findElement(By.id("numOne")).sendKeys("6");
        ITTestRunner.driver.findElement(By.id("numTwo")).sendKeys("3");
    }

    @When("The user clicks the subtract button")
    public void the_user_clicks_the_subtract_button() {
        ITTestRunner.driver.findElement(By.id("subtract")).click();
    }

    @Then("The user should get an alert with the numbers subtracted")
    public void the_user_should_get_an_alert_with_the_numbers_subtracted() {
        ITTestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String result = ITTestRunner.driver.switchTo().alert().getText();
        ITTestRunner.driver.switchTo().alert().accept();
        Assert.assertEquals("3", result);
    }

}

Feature: Users should be able to do basic math with the calculator

    Background: users should be on the calculator home page
        Given   The user is on the calculator home page
    Scenario: As a user I want to use the add feature to make math easier
        When    The user provides two numbers to add
        When    The user clicks the add button
        Then    The user should get an alert with the numbers added together
    Scenario: As a suer I want to use the subtract feature to make math easier
        When    The user provides two numbers to subtract
        When    The user clicks the subtract button
        Then    The user should get an alert with the numbers subtracted
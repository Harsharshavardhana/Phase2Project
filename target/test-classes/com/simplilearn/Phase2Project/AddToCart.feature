
@tag
Feature: This feature will be used to test the login functionality of saucedemo application

   Scenario: Validate the Login success scenario
    Given I have launched the application
    When I enter username 
    And I enter password 
    And I click on Login button
    Then I should land on home page with welcome message
    When Login is ok take product  put it cart product name is Sauce Labs Backpack
    When I should click cart button
    Then Check product is avaible in cart 

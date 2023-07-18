
@tag
Feature: This feature will be used to test the login functionality of saucedemo application

   Scenario: Validate the Login success scenario
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on home page
    And Login is ok take product  put it cart product name is "Sauce Labs Backpack"
    And Check product is avaible in cart 

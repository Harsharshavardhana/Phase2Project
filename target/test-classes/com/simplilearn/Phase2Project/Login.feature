@tag
Feature: This feature will be used to test the login functionality of saucedemo application

   Scenario: Validate the Login success scenario
    Given I have launched the application
    When I enter username 
    And I enter password 
    And I click on Login button
    Then I should land on home page with welcome message
    
    Scenario Outline: Validate the Login failure scenario using examples
     Given I have launched the application
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on Login button
    Then I should get the error message as "<Error>"

    Examples: 
      | UserName    | Password | Error                                                                            |
      | standard_user | 12345 | Epic sadface: Username and password do not match any user in this service.        |
      |locked_out_user| secret_sauce | Epic sadface: Sorry, this user has been locked out.                        |


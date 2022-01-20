Feature:  Login Functionality test
  As a user i should be able to Login successfully

  Background:
    Given I am on Homepage
    Then I verify Login link displayed on Homepage

  Scenario Outline: I want to verify error message after login with invalid credential

    When I click login link
    Then I navigate to Login page and verify HeartBingo logo
    And I add "<USERNAME>" in username field
    And I add "<PASSWORD>" in password field
    And I click on Login button
    And I should see "<ERROR>" message and verify it
    And I close Login frame
    Then I should back on Homepage and verify that i am on Homepage


    Examples:
      | USERNAME      | PASSWORD | ERROR                                                                |
      | bob           | bob123   | The username or password you entered is incorrect. Please try again. |
      | bob@gmail.com | bob123   | The username or password you entered is incorrect. Please try again. |

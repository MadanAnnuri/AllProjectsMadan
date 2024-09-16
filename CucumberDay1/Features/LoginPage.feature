Feature: Loginpage Scenarios
  Scenario: Validate Login functionality  with Correct Username and Password
    Given I am in login page
    When I enter correct Username and Password
    And Click on submit button
    Then Login should be successful
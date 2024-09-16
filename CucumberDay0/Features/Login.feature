Feature: Login page Scenarios
  Scenario: Correct Username and password
    Given I am in login page
    When I enter correct username and password
    And i click on submit button
    Then I shouid land on successfull login

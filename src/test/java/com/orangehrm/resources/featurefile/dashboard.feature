Feature: Navigate to Dashboard elements
  As a user
  I want to visit Orange Hrm website

  Scenario: Verify user should navigate to Dashboard elements
    Given I am on Admin page
    When click on Admin Button
    And Click on Add button
    Then I should see Add User button

  Scenario: Verify user should navigate to MarketPlace element
    Given I am on Admin page
    When click on MarketPlace Button
    Then I should see OrangeHRM Addons on page
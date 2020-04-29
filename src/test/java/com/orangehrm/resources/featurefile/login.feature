Feature: Login Functionality
  As a User
  I want to visit Orange Hrm website

  Scenario: Verify user should login with valid credentials
    Given I am on home page
    When I enter username "Admin"
    And  I enter password "admin123"
    And  Click on Login button
    Then I should login successfully on Orange Hrm website

  Scenario Outline: Verify user should not login with invalid credentials
    Given I am on home page
    When I enter username "<username>"
    And I enter password "<password>"
    And click on Login Btn
    Then I should see error message "<errorMessage>"
    Examples:
      | username | password | errorMessage        |
      | dhanno   | dh123    | Invalid credentials |
      | runner   | slow123  | Invalid credentials |
      | slowrun  | fast234  | Invalid credentials |
      | xyzabc   | zxy123   | Invalid credentials |

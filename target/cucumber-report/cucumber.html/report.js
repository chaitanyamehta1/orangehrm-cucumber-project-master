$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/orangehrm/resources/featurefile/dashboard.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to Dashboard elements",
  "description": "As a user\nI want to visit Orange Hrm website",
  "id": "navigate-to-dashboard-elements",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6472920525,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should navigate to Dashboard elements",
  "description": "",
  "id": "navigate-to-dashboard-elements;verify-user-should-navigate-to-dashboard-elements",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Admin page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on Admin Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Add button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see Add User button",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardTest.iAmOnAdminPage()"
});
formatter.result({
  "duration": 12277742704,
  "status": "passed"
});
formatter.match({
  "location": "DashBoardTest.clickOnAdminButton()"
});
formatter.result({
  "duration": 928261739,
  "status": "passed"
});
formatter.match({
  "location": "DashBoardTest.clickOnAddButton()"
});
formatter.result({
  "duration": 10566070817,
  "status": "passed"
});
formatter.match({
  "location": "DashBoardTest.iShouldSeeAddUserButton()"
});
formatter.result({
  "duration": 78163593,
  "status": "passed"
});
formatter.after({
  "duration": 75071,
  "status": "passed"
});
formatter.before({
  "duration": 5134134090,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify user should navigate to MarketPlace element",
  "description": "",
  "id": "navigate-to-dashboard-elements;verify-user-should-navigate-to-marketplace-element",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on Admin page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "click on MarketPlace Button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should see OrangeHRM Addons on page",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardTest.iAmOnAdminPage()"
});
formatter.result({
  "duration": 11536439547,
  "status": "passed"
});
formatter.match({
  "location": "DashBoardTest.clickOnMarketPlaceButton()"
});
formatter.result({
  "duration": 2073849682,
  "status": "passed"
});
formatter.match({
  "location": "DashBoardTest.iShouldSeeOrangeHRMAddonsOnPage()"
});
formatter.result({
  "duration": 20170416315,
  "status": "passed"
});
formatter.after({
  "duration": 18050,
  "status": "passed"
});
formatter.uri("src/test/java/com/orangehrm/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "As a User\nI want to visit Orange Hrm website",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5269484903,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should login with valid credentials",
  "description": "",
  "id": "login-functionality;verify-user-should-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should login successfully on Orange Hrm website",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.iAmOnHomePage()"
});
formatter.result({
  "duration": 42663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    }
  ],
  "location": "LoginTest.iEnterUsername(String)"
});
formatter.result({
  "duration": 111474569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 18
    }
  ],
  "location": "LoginTest.iEnterPassword(String)"
});
formatter.result({
  "duration": 105027495,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.clickOnLoginButton()"
});

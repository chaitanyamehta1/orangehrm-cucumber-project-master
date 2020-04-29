package com.orangehrm.pages;

import com.cucumber.listener.Reporter;
import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Chaitanya
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //below variables stored locators
    @FindBy(id = "txtUsername")
    WebElement _userNameField;
    @FindBy(id = "txtPassword")
    WebElement _passwordField;
    @FindBy(id = "btnLogin")
    WebElement _clickOnLoginButton;
    @FindBy(id = "welcome")
    WebElement _welcomeAdminText;
    @FindBy(id = "spanMessage")
    WebElement _errorMessage;


    //below methods created for each element and doing action on each element
    public void setUserNameField(String admin) {
        Reporter.addStepLog("Enter user name " + admin + "Username field " + _userNameField.toString());
        sendTextToElement(_userNameField, admin);
        log.info("Enter user name " + admin + "Username field " + _userNameField.toString());
    }

    //below methods created for each element and doing action on each element
    public void setPasswordField(String password) {
        Reporter.addStepLog("Enter password " + password + "Password field " + _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Enter password " + password + "Password field " + _passwordField.toString());
    }

    public void setClickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button " + _clickOnLoginButton.toString());
        clickOnElement(_clickOnLoginButton);
        log.info("Clicking on login button " + _clickOnLoginButton.toString());
    }

    public String getWelcomeAdminText() {
        Reporter.addStepLog("Getting welcome admin text " + _welcomeAdminText.toString());
        log.info("Getting welcome admin text " + _welcomeAdminText.toString());
        return getTextFromElement(_welcomeAdminText);
    }

    public String getErrorText() {
        Reporter.addStepLog("Getting Error Text " + _errorMessage.toString());
        log.info("Getting Error Text " + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }


}

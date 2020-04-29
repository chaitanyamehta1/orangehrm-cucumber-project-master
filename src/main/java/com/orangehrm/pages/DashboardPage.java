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
public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement _adminFeature;
    @FindBy(id = "btnAdd")
    WebElement _add;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement _getAddText;
    @FindBy(xpath = "//input[@id='MP_link']")
    WebElement _marketPlaceButton;
    @FindBy(xpath = "//h1[@id='menu']")
    WebElement _getOrangeMenu;

    public String getOrangeTextMessage() {
        Reporter.addStepLog("Getting Orange Text Message " + _getAddText.toString());
        log.info("Getting Orange Text Message" + _getAddText.toString());
        return getTextFromElement(_getOrangeMenu);
    }

    public void clickOnMarketPlace() {
        Reporter.addStepLog("Clicking On Market Place Button " + _marketPlaceButton.toString());
        clickOnElement(_marketPlaceButton);
        log.info("Clicking On Market Place Button" + _marketPlaceButton.toString());
    }

    public String getAddTextMessage() {
        Reporter.addStepLog("Getting Add Feature Text Message " + _getAddText.toString());
        log.info("Getting Add Feature Text Message " + _getAddText.toString());
        return getTextFromElement(_getAddText);
    }

    public void clickOnAdminFeature() {
        Reporter.addStepLog("Clicking on admin button " + _adminFeature.toString());
        clickOnElement(_adminFeature);
        log.info("Clicking on admin button " + _adminFeature.toString());
    }

    public void clickOnAddButton() {
        Reporter.addStepLog("Clicking on add button " + _add.toString());
        clickOnElement(_add);
        log.info("Clicking on add button " + _add.toString());
    }


}

package com.orangehrm.cucumber.stepdefs;

import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Chaitanya
 */
public class DashBoardTest {
    @Given("^I am on Admin page$")
    public void iAmOnAdminPage() {
        new LoginPage().setUserNameField("Admin");
        new LoginPage().setPasswordField("admin123");
        new LoginPage().setClickOnLoginButton();
    }

    @When("^click on Admin Button$")
    public void clickOnAdminButton() {
        new DashboardPage().clickOnAdminFeature();

    }

    @And("^Click on Add button$")
    public void clickOnAddButton() {
        new DashboardPage().clickOnAddButton();
    }

    @Then("^I should see Add User button$")
    public void iShouldSeeAddUserButton() {
        Assert.assertEquals(new DashboardPage().getAddTextMessage(), "Add User");
    }

    @When("^click on MarketPlace Button$")
    public void clickOnMarketPlaceButton() {
        new DashboardPage().clickOnMarketPlace();
    }

    @Then("^I should see OrangeHRM Addons on page$")
    public void iShouldSeeOrangeHRMAddonsOnPage() {
        Assert.assertEquals(new DashboardPage().getOrangeTextMessage(), "OrangeHRM Addons");
    }
}

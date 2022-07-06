package com.upgenix.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the upgenix login page")
    public void userIsOnTheUpgenixLoginPage() {
    }

    @When("Salesmanager enters valid email {string} and password {string}")
    public void salesmanagerEntersValidEmailAndPassword(String arg0, String arg1) {
    }

    @And("Salesmanager-Posmanager clicks on the {string} button")
    public void salesmanagerPosmanagerClicksOnTheButton(String arg0) {
    }

    @Then("Salesmanager should login successfully - verify that title contains {string}")
    public void salesmanagerShouldLoginSuccessfullyVerifyThatTitleContains(String arg0) {
    }

    @When("Posmanager enters valid email {string} and password {string}")
    public void posmanagerEntersValidEmailAndPassword(String arg0, String arg1) {
    }

    @Then("Posmanager should login successfully - verify that title contains {string}")
    public void posmanagerShouldLoginSuccessfullyVerifyThatTitleContains(String arg0) {
    }

    @Given("Posmanager enters valid email {string} and invalid password {string}")
    public void posmanagerEntersValidEmailAndInvalidPassword(String arg0, String arg1) {
    }

    @Then("Salesmanager-Posmanager should see {string} text above the {string} button")
    public void salesmanagerPosmanagerShouldSeeTextAboveTheButton(String arg0, String arg1) {
    }

    @Given("Salesmanager enters invalid email {string} and valid password {string}")
    public void salesmanagerEntersInvalidEmailAndValidPassword(String arg0, String arg1) {
    }

    @And("Salesmanager-Posmanager clicks the login button")
    public void salesmanagerPosmanagerClicksTheLoginButton() {
    }

    @Then("Salesmanager-Posmanager sees {string} text above the {string} button")
    public void salesmanagerPosmanagerSeesTextAboveTheButton(String arg0, String arg1) {
    }

    @Given("Posmanager enters invalid email {string} and valid password {string}")
    public void posmanagerEntersInvalidEmailAndValidPassword(String arg0, String arg1) {
    }

    @Given("Salesmanager enters valid email {string} and invalid password {string}")
    public void salesmanagerEntersValidEmailAndInvalidPassword(String arg0, String arg1) {
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String arg0) {
    }

    @Given("Salesmanager-Posmanager clicks on the reset password link")
    public void salesmanagerPosmanagerClicksOnTheResetPasswordLink() {
    }

    @Then("Salesmanager-posmanager sees {string} in the title")
    public void salesmanagerPosmanagerSeesInTheTitle(String arg0) {
    }

    @When("Salesmanager-Posmanager enters a password")
    public void salesmanagerPosmanagerEntersAPassword() {
    }

    @Then("Salesmanager-Posmanager sees the bullet signs while writing the password")
    public void salesmanagerPosmanagerSeesTheBulletSignsWhileWritingThePassword() {
    }

    @When("PosManager enters valid credentials {string} - password {string} and hits Enter")
    public void posmanagerEntersValidCredentialsPasswordAndHitsEnter(String arg0, String arg1) {
    }

    @Then("PosManager should login successfully and see the dashboard, verify page title is {string}.")
    public void posmanagerShouldLoginSuccessfullyAndSeeTheDashboardVerifyPageTitleIs(String arg0) {
    }



}

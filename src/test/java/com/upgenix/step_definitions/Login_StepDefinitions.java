package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the upgenix login page")
    public void userIsOnTheUpgenixLoginPage() {
        String url = ConfigurationReader.getProperty("UpgenixLoginPage.url");
        Driver.getDriver().get(url);
    }

    @When("Salesmanager enters valid email {string} and password {string}")
    public void salesmanagerEntersValidEmailAndPassword(String email, String password) {
       loginPage.inputEmail.sendKeys(email);
       loginPage.inputPassword.sendKeys(password);
    }

    @And("Salesmanager-Posmanager clicks on the {string} button")
    public void salesmanagerPosmanagerClicksOnTheButton(String arg0) {
        loginPage.loginButton.click();
    }

    @Then("Salesmanager should login successfully - verify that title contains {string}")
    public void salesmanagerShouldLoginSuccessfullyVerifyThatTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("Posmanager enters valid email {string} and password {string}")
    public void posmanagerEntersValidEmailAndPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("Posmanager should login successfully - verify that title contains {string}")
    public void posmanagerShouldLoginSuccessfullyVerifyThatTitleContains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Given("Posmanager enters valid email {string} and invalid password {string}")
    public void posmanagerEntersValidEmailAndInvalidPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("Salesmanager-Posmanager should see {string} text above the {string} button")
    public void salesmanagerPosmanagerShouldSeeTextAboveTheButton(String arg0, String arg1) {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @Given("Salesmanager enters invalid email {string} and valid password {string}")
    public void salesmanagerEntersInvalidEmailAndValidPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @And("Salesmanager-Posmanager clicks the login button")
    public void salesmanagerPosmanagerClicksTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("Salesmanager-Posmanager sees {string} text above the {string} button")
    public void salesmanagerPosmanagerSeesTextAboveTheButton(String email, String password) {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }

    @Given("Posmanager enters invalid email {string} and valid password {string}")
    public void posmanagerEntersInvalidEmailAndValidPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @Given("Salesmanager enters valid email {string} and invalid password {string}")
    public void salesmanagerEntersValidEmailAndInvalidPassword(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password);
    }

    @Then("{string} message should be displayed")
    public void messageShouldBeDisplayed(String arg0) {
        Assert.assertTrue(loginPage.inputEmail.getAttribute("validationMessage").equalsIgnoreCase("Veuillez renseigner ce champ."));
    }

    @Given("Salesmanager-Posmanager clicks on the reset password link")
    public void salesmanagerPosmanagerClicksOnTheResetPasswordLink() {
        loginPage.resetPassword.click();
    }

    @Then("Salesmanager-posmanager sees {string} in the title")
    public void salesmanagerPosmanagerSeesInTheTitle(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @When("Salesmanager-Posmanager enters a password")
    public void salesmanagerPosmanagerEntersAPassword() {
        loginPage.inputPassword.sendKeys();
    }

    @Then("Salesmanager-Posmanager sees the bullet signs while writing the password")
    public void salesmanagerPosmanagerSeesTheBulletSignsWhileWritingThePassword() {
        Assert.assertTrue(loginPage.inputPassword.getAttribute("type").equals("password"));
    }

    @When("PosManager enters valid credentials {string} - password {string} and hits Enter")
    public void posmanagerEntersValidCredentialsPasswordAndHitsEnter(String email, String password) {
        loginPage.inputEmail.sendKeys(email);
        loginPage.inputPassword.sendKeys(password + Keys.ENTER);
    }

    @Then("PosManager should login successfully and see the dashboard, verify page title is {string}.")
    public void posmanagerShouldLoginSuccessfullyAndSeeTheDashboardVerifyPageTitleIs(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }



}

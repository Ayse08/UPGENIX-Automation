package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.pages.LogoutPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {

    LogoutPage logoutPage = new LogoutPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the upgenix login page")
    public void userIsOnTheUpgenixLoginPage() {

        String url = ConfigurationReader.getProperty("UpgenixLoginPage.url");
        Driver.getDriver().get(url);
    }

    @And("Posmanager enters valid email posmanager{int}@info.com - password posmanager and hits enter")
    public void posmanagerEntersValidEmailPosmanagerInfoComPasswordPosmanagerAndHitsEnter(int arg0) {
        loginPage.inputEmail.sendKeys("posmanager15@info.com");
        loginPage.inputPassword.sendKeys("posmanager");
        loginPage.loginButton.click();
    }

    @Then("Posmanager login successfully verify that title contains Odoo")
    public void posmanagerLoginSuccessfullyVerifyThatTitleContainsOdoo() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Odoo"));
    }



    @When("user clicks on the profile icon")
    public void userClicksOnTheProfileIcon() {
        logoutPage.profileIcon.click();
    }

    @And("verify that Log out button is visible")
    public void verifyThatLogOutButtonIsVisible() {
        Assert.assertTrue(logoutPage.logoutButton.isDisplayed());
    }

    @And("user clicks on the Log out button from the dropdown")
    public void userClicksOnTheLogOutButtonFromTheDropdown() {
        logoutPage.logoutButton.click();
    }

    @Then("user can log out successfully - verify that title is Login | Best solution for startups.")
    public void userCanLogOutSuccessfullyVerifyThatTitleIsLoginBestSolutionForStartups() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Login | Best solution for startups"));
    }

    @When("User click on the profile icon")
    public void user_click_on_the_profile_icon() {
       logoutPage.profileIcon.click();
    }
    @When("User clicks on the Log out button")
    public void user_clicks_on_the_log_out_button() {
        logoutPage.logoutButton.click();
    }


    @Then("User clicks to step back button and sees the Odoo Session Expired message")
    public void userClicksToStepBackButtonAndSeesTheOdooSessionExpiredMessage() {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(logoutPage.expiredMessage.isDisplayed());

    }

}


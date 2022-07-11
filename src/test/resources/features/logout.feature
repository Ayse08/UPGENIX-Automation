@wip
Feature: Upgenix app logout functionality

User story : As a user, I should be able to log out.

  Background: For the scenarios in the feature file, user is expected to be logged in.
    Given User is on the upgenix login page
    And Posmanager enters valid email posmanager15@info.com - password posmanager and hits enter
    Then Posmanager login successfully verify that title contains Odoo

    Scenario: User can log out and ends up in login page.
      When user clicks on the profile icon
      And verify that Log out button is visible
      And user clicks on the Log out button from the dropdown
      Then user can log out successfully - verify that title is Login | Best solution for startups.

  Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
    When User click on the profile icon
    And User clicks on the Log out button
    Then User clicks to step back button and sees the Odoo Session Expired message
Feature: Adding languges in Qualification page


  Background:

    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    When user clicks on Admin option
    And user clicks on Qualification option
    And user clicks on languages in drop down list
    And user clicks on Add button

  Scenario: Adding  Russian language
    And user enters a language
    And user clicks on save button
    Then language added successfully

  Scenario: Adding  Italian language
    And user enters a language
    And user clicks on save button
    Then language added successfully
Feature: Adding languges in Qualification page


  Background:

    Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    When user clicks on Admin option
    And user clicks on Qualification option
    And user clicks on languages in drop down list
    And user clicks on Add button
@test
  Scenario: Adding  Russian language
    #Given user is navigated to HRMS application
    #When user enters valid admin credentials
    #And user clicks on login button
    #When user clicks on Admin option
    #And user clicks on Qualification option
    #And user clicks on languages in drop down list
    #And user clicks on Add button
    And user enters a 1st language
    Then language added successfully 1st language

  Scenario: Adding  Italian language
    #Given user is navigated to HRMS application
    #When user enters valid admin credentials
    #And user clicks on login button
    #When user clicks on Admin option
    #And user clicks on Qualification option
    #And user clicks on languages in drop down list
    #And user clicks on Add button
    And user enters a 2nd language

    Then language added successfully 2nd language
@smoke @Regression
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background: for the Scenarios in the feature file
    Given user is on library login page


  @librarian @employee
  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

    @student
    Scenario: Login as a student
      When user enters student username
      And user enters student password
      Then user should see dashboard


      @admin @employee @smoke
      Scenario: Login as an admin
        When user enters admin username
        And user enters admin password
        Then user should see dashboard



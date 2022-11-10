Feature: Wikipedia search functionality and verifications

Background:
  Given User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality title verification
    When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the wiki title

@smoke
  Scenario: Wikipedia Search Functionality title verification
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


    Scenario Outline: Wikipedia search functionality with DDT
      When User types "<searchValue>" in the wiki search box
      And User clicks wiki search button
      Then User sees "<expectedTitle>" is in the wiki title

      Examples:
        | searchValue | expectedTitle |
        | Bill Gates  | Bill Gates    |
        | Steve Jobs  | Steve Jobs    |
        | Elon Mask   | Elon Mask     |
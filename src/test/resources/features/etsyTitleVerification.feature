Feature: Etsy title verification
  User story: user is on Etsy website and should be able
  to see title as expected

  Background:
    Given  user is on etsy home page


  Scenario: title verification
    And User sees title is as expected.

@smoke
 Scenario: search functionality

   Then user types "Wooden spoon" in search bar
   And user sees "Wooden spoon" in the title



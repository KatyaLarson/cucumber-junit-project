@eating
Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of anything may not be good for you


  Background:
    Given John is hungry
  @eating
  Scenario: Eating a few is no problem

    When he eats some cucumbers
    Then he will be full
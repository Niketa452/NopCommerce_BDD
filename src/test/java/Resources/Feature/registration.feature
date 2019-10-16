@regression
Feature: User should be able to register successfully
  @register
  Scenario: As a user I should be able to register successfully
    Given I am on the Registeration page
    When I fill all compulsory fields
    And I click on Registeration button
    Then Your registration is completed message should be displayed

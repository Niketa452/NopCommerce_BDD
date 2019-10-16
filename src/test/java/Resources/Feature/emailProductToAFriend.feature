@regression
Feature: Refer product to a friend
  @emailProductafriend
  Scenario: As a registered user I should be able to refer product to a friend
    Given I am on the product page
    When I click on 'Email a friend' button
    And I should be navigated to the 'Email a friend' details page
    And I fill all the compulsory fields
    And click on 'Send mail' button
    Then 'Your message has been sent' message should be displayed

  @emailProductafriendUnregisteredUser
    Scenario: As an unregistered user I should not be able to refer a product to a friend
      Given I am on the home page
      When I click on a product and 'email a friend' button
      And I enter friend's email and my email
      Then 'Only registered customers can use email a friend feature' message should be displayed
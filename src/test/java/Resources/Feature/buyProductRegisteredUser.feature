@regression
Feature: User should be able to buy products
@buyproduct
  Scenario: As a user I should be able to buy products successfully
    Given I am a registered user
    When I click on 'Books' category and select a product and click on shopping cart
    And I click on 'Checkout' button
    And I fill chekout form details
    Then I should recieve 'Your order has been successfully processed' message


  @checkoutAsGuest
  Scenario: As a guest user I should be able to buy products successfully
    Given I am on books category page
    When I click on Add to cart button
    And I check the Terms and condition radio button
    And I click on 'Checkout' button on the shopping cart page
    And I click on 'Checkout as a guest' button
    And I fill checkout form details as a guest
    Then 'Your order has been successfully processed' message should be displayed

@feature_checkout
Feature: Test cases for checkout

  @checkout
  Scenario: Test case for checking checkout
    Given the homepage is loaded on login
    And I click on "Sauce Labs Backpack" item on homepage
    Then Product page of "Sauce Labs Backpack" is displayed
    And I click on add to cart button on product page
    And I click on cart button on the header
    Then Cart page is displayed
    And I click on checkout button
    Then I verify checkout page "1" is displayed
    And I add "<firstname>" "<lastname>" "<zipcode>" on checkout page1
#    And I add lastname on checkout page1
#    And I add zipcode on checkout page1
    And I click on Continue button on checkout page1
    Then I verify checkout page "2" is displayed
    Then I verify payment and shipping information section is displayed on checkout page2
    And I Click on finish on checkout page2
    Then I verify checkout page "3" is displayed
    Then back home button is displayed on checkout page3

Examples:
    |firstname|lastname|postalcode|
    |Neha|Singh|345434|
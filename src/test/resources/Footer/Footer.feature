@feature_footer
Feature: Test cases for footer

  @footer
  Scenario: Test case for checking footer on home page
    Given the homepage is loaded on login
    And I verify Twitter icon on the footer
    And I verify Facebook icon on the footer
    And  I verify LinkedIn icon on the footer
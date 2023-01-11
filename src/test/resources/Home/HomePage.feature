@feature_homepage
Feature: Test cases for home page

  @homepage1
  Scenario: Test case for checking secondary header for home page
    Given the homepage is loaded on login
    And the secondary header has the title 'Products'
    And the secondary header has sort button

  @homepage2
  Scenario Outline: Test case for checking sort functionality on home page
    Given the homepage is loaded on login
    And I choose sort option "<sortOption>"
    And I verify if the sort is successful for "<sortOption>"

    Examples:
      | sortOption |
      | Name (A to Z)|
      | Name (Z to A)|
      | Price (low to high)|
      | Price (high to low)|














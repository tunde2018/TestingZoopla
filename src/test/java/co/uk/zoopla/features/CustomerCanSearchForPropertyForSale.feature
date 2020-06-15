Feature: For Sale Search
  As a customer
  I want the ability to search for any properties of my choice
  So that I can choose one to buy

Scenario Outline: Customer can Search for any property
    Given I navigate to Zoopla homepage
    When  I enter "<Location>" into the search field
    And I select "<MinPrice>" from Min price
    And I select "<MaxPrice>" from Max price
    And I select "<PropertyType>" from Property type
    And I select "<NoOfBeds>" from Bedrooms
    And I click on Search button
    Then the search "<Location>" is displayed

  
  Examples:
    |Location| MinPrice|MaxPrice|PropertyType|NoOfBeds|
    |Leeds   |No min   |No max  |Show all    |No min  |
#    |Leeds   |£180,000   |No max  |Show all    |No min  |
#    |Leeds   |No min   |£500,000  |Show all    |No min  |
#    |Leeds   |£180,000   |£500,000  |Show all    |No min  |
#    |Leeds   |£180,000   |£500,000  |Houses    |No min  |
#    |Leeds   |£180,000   |£500,000  | Show all  |3+  |
#    |OL10 3Hl  |£180,000   |£500,000  |Show all    |3+  |
#    | Moston, Greater Manchester     |£180,000   |£500,000  |Show all     |3+  |





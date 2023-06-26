Feature: Searching Products

  Scenario Outline: Searching the Products with the text
    
    Given: User is on browser
    And: navigates to flipkart page
    When: User enters <searchkeywords>
    And: User click on search button
    Then: The products need to display
    
    Examples:
    |searchkeywords|
    |iphone|
    |moto|
    |jbl headphone|


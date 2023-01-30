Feature: feature to test googe search for flipkart

  Scenario: Validating whether the google is showing flipkart site
    Given Browser is open
    And user is on google page
    When user enters flipkart in search bar
    And hits enter
    Then user needs to be navigated to the search results

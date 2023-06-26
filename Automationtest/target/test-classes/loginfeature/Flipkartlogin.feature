Feature: Login to Flipkart

  Scenario: user login with valid credentials
    Given user is on flipkart site
    And user needs to click login button
    When user needs to enter credentials
    And user needs to click Login button again
    Then user needs to be logged in

Feature: Login to Samplewebsite

  Scenario Outline: user login
    Given user is on sample login site
    And user is on Login page
    When user needs to enter <username> and <password>
    And Click on Login page
    Then user is navigated

    Examples: 
      | username | password |
      | prbg     |    12345 |
      | hell     |    12345 |

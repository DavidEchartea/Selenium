Feature: Test google search functionability

Scenario: As a user I enter a search criteria in Google
    Given Im on the google search page
    When I enter the search criteria
    And Click on the search button
    Then the results match the criteria
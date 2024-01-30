Feature: Search Functionality

Scenario: User Searches for a valid product
Given User is on the Home page
When User enters the valid product "iphone" in the search field
And User clicks on the search button
Then User should get valid product displayed in search result

Scenario: User Searches for a invalid product
Given User is on the Home page
When User enters the invalid product "Honda" in the search field
And User clicks on the search button
Then User should get message as no product matching 

Scenario: User Searches without any product
Given User is on the Home page
When User dont enter any product in the search field
And User clicks on the search button
Then User should get message as no product matching 
Feature: Functional testing on testme
Scenario: valid login

Given user has launched testme app in the browser
When User enters "tilak29081998@gmail.com" and "9551752324"
And click on the login button
Then user must be logged in successfully
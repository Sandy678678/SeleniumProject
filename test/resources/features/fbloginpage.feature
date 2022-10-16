Feature: To validate fb login funcionality
Scenario: To validate error message using invalid username and password
Given User launches Facebook url
When User enters invalid username
And User enters invalid password
And User clicks on login button
Then User captures the error message
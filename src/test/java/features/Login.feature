Feature: login functionality

@smoke 
Scenario: verify the login functionality
Given we have a URL and launch the browser
When user enter the valid username and password
And click on the login button
Then validate the user to navigate to the home page


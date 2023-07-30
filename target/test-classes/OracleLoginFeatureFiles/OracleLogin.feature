Feature: Oracle Application Login

@SmokeTest
Scenario Outline: Oracle Login

Given Initialize the chrome driver
When user navigates to "https://practicetestautomation.com/practice-test-login/"
And user enters the <username> and <password> and clicks on login button
Then user should able to login

Examples:
|username|password|
|Sushant|Sushant123|
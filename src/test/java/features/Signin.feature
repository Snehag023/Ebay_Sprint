Feature: Personal_Account
Scenario Outline: Verify the user is able to Signin with Email

Given browser should Open
When Web Application is displayed
When User Clicks on Signin option
Then user Enter the Valid Email "<email>"
And user click on continue button
And user enter The Valid Password "<password>"
And user click on Signin 
Then browser is closed

Examples:
|email                  |password |                  
|snehagavali2@gmail.com |sneha1234|
Feature: Personal_Account
Scenario Outline: Verify user is able to Signin with Facebook Account
Given Browser is Open
When web page is displayed
And user clicks on Signin 
And user click on cotinue with Facebook option
And user Enter the valid Email "<email>"
And user should click on continue
And user enter the Valid Password "<password>"
And user click on login
Then Browser is close

      Examples:
      |email                     |password   |
      |vishakhajagtap2@gmail.com |vish1234   |  
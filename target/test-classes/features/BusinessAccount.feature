Feature: Personal_Account
Scenario Outline: Verify the user is able to Register With Bussiness Account

Given browser is Open
When web application is displayd
Then Click on business Acount Radio button
And user drop Help message
And user enter the Valid Businessname "<business_name>"
And user enter the Valid BusinessEmail "<email>"
And User enter the Valid Password  "<password>"
And user Select Valid Business Location 
Then user Click on Register
And Browser Is Close        

 Examples:
 |business_name|email               |password   |
 |sneha        |ruchikab23@gmail.com|ruchi1234  |

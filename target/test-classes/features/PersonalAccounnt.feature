Feature: Personal_Account
Scenario Outline: Verify user is able to Register with Personal Account
Given Browser Is Open
When Web Application is Displayed
And clicks on Register Option
And  user clicks on personal account radio Button
And  user enter the valid firstname "<firstname>"
And  user enter the valid lastname "<lastname>"
And  user enter the valid email "<email>"
And  user enter valid password "<password>"  
Then user click on Submit
And browser should close

    Examples: 
      | firstname  | lastname |email                   |password   |
      | sneha      |   gavali | snehagavali2@gmail.com | sneha1234 |     
     

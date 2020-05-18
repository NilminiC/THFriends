@Login
Feature: I want to login to Futureready website
Scenario Outline: Positive test on login
Given User navigated to website url
When User enters <username> and <password> and logs in
Then Check user login to the main page
    
Examples:
|username |password |
|demouser |demoUser1|
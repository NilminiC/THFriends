Feature: I want to create a Pet Insurance
@PetInsurance
Scenario Outline: Positive test on Pet Insurance
Given User navigated to website url
When User enters <username> and <password> and logs in
Then Navigate to Pet Insurance page
Then Select the Falcon Insurer 
And Select the plan
Then User fill in the prospect detail for the plan

Examples:
|username |password |
|demouser |demoUser1|
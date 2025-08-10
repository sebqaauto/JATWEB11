Feature: Demo Web Shop Test

Background:
Given user opens the website demowebshop

@regression
Scenario Outline: User Registration test
When user clicks on Register link
And enters the gender details "<Gender>"
And enters the first name "<FirstName>"
And enters the last name "<LastName>"
And enters the email id "<Email>"
And enters the password "<Password>"
And enters the confirm password "<ConfirmPassword>"
And clicks on the Register button
Then user should be registered successfully

Examples:
	|Gender|FirstName|LastName|Email|Password|ConfirmPassword|
	|female|Sunita|Williams|Sunita.2305@nasa.com|YouKnowMe001|YouKnowMe001|
	|male|Sam|Williams|Sam.2306@nasa.com|YouKnowMe001|YouKnowMe001|
	|female|Serena|Williams|Serena.2307@nasa.com|YouKnowMe001|YouKnowMe001|
	|male|Rahul|Williams|Rahul.2308@nasa.com|YouKnowMe001|YouKnowMe001|
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios/user stories.
#Scenario: Business rule through list of steps with arguments. - Similar to @Test in testng
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder> - Similar to @DataProvider in testng
#Examples: Container for storing table data
#Background: List of steps run before each of the scenarios - @BeforeTest annotation of testng
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios - similar to groups in testng 
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Demo Web Shop Features
  I want to use this template for my feature file

 Background:
	Given the browser is launched
	
Scenario: User Registration Test
Given user opens the website demowebshop
When user clicks on Register link
And enters the gender details
And enters the first name
And enters the last name
And enters the password
And enters the confirm password
And clicks on the Register button
Then user should be registered successfully

	
#To run your test only once, but if you need parameterise the step then its possible with Datatable, 
# if there are multiple entries in the table, then it will repeat the step alone



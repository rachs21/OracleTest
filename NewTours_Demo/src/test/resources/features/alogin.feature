@Login
Feature: To Login New Tours Company Webpage
   As an user of the New Tours 
   I want to Login to webpage of New Tours
   In order to Test Login functionality
   
   Background: Successful Login  
	Given I am on the Homepage page on URL "http://newtours.demoaut.com" 
	Then I should see "Welcome: Mercury Tours"  as page title 
     
       
     
   Scenario Outline: Successful Login 
	When I enter Username as "<user>"
	And I enter Password as "<password>"
	And I click on the Login button
	Then I should see the title as "Find a Flight: Mercury Tours:"
	Examples:
	| user | password |
	| mercury | mercury |
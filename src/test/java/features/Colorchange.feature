@Suit 
Feature: Validate the automationProject cucumber feature 

Background: 
	Given The user is at the given Website 
	
Scenario: User should be able change background color to blue 
	When Set SkyBlue Background button exists 
	When I click on the button 
	Then The background color will change to sky blue 
	
	
Scenario: USer should be able to change background color to white 
	Given Set SkyWhite Background button exists 
	When  I click on the SkyWhitebutton 
	Then  The background color will change to white
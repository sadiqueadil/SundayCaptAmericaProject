@regression @smoke @SDQ @E2E
Feature: Ebay SignIn Functionality
	
	Background:
		Given 	Open Ebay Homepage	
	
	Scenario:	Login to Signin Function
		When 	Click on the Homepage Signin link
		And 	Write Username and Click Continue Button
		And 	Write Password and Click Signin
		Then 	The user Should Have Logged in Successfully
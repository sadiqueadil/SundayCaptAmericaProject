@regression @smoke @CAL @E2E
Feature: Ebay Search Functionality for Laptop

	Background:
		Given 	Open Ebay Homepage

	Scenario: 	Search for Laptop Item
		When 	Search for Laptop
		And 	Click Search Button
		Then 	Item list should have only Laptop Related Products
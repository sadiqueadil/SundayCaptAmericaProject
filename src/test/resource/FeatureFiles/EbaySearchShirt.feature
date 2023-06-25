@regression @smoke @SA-P @E2E
Feature: Ebay Search Functionality for Shirt

	Background:
		Given 	Open Ebay Homepage

	Scenario:	Search for Shirt
		When 	Search for Shirt
		And 	Click Search Button
		Then 	Item list should have only Shirt related products
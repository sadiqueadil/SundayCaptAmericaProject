@regression @smoke @SDQ-Alt @E2E
Feature: User can Handle Alert using Selenium Alert

Scenario: Rahul Shetty Alert Handling

	Given 	Open Rahul Shetty Automation Practice Page
	When 	Type Your Name Under Switch To Alert Example Text Box and Click Alert Button
	Then 	Handle the Pop-Up Simple Alert with OK Button
	And 	Type Your Name Under Switch To Alert Example Text Box and Click Confirm Button
	And 	Handle the Pop-Up Confirmation Alert with Cancel Button

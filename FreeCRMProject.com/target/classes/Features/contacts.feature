Feature: Free CRM Contact feature

 #With Example keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on login page
When title of login page is free CRM
Then user enteres "<username>" and "<password>"
Then user clicks on login button

Examples:
	| username | password |
	| abc@gmail.com | 1234 |
	| tom@gmail.com | 123  |
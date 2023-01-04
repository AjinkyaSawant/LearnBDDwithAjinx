
Feature: OpenHomePage

Scenario: User is able to openHomePage

	Given User launch the browser 
	When User opens the URL "https://www.amazon.in/"
	Then Page title should contain "Online Shopping site in India"

@Regression
Scenario Outline: openHomePage Data Driven test

	Given User launch the browser 
	When User opens the URL <url>
	Then Page title should contain <titleContent>
	
	Examples:
		|url  | titleContent |
		|"https://www.google.com/" |"Google" |
		|"https://www.myntra.com/"|"Online Shopping"|

		
		
		
		
		
		
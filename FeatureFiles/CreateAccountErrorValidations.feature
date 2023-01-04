@Amazon
Feature: Amazon create account page error validations

	
  Scenario: Validate all the error message strings 
    Given User navigates to create account page
    When User clicks on the continue button on create account page
    Then Create Account heading is displayed on create account page
    And Name error message is displayed
    And Mobile number error message is displayed
    And Password error message is displayed

  

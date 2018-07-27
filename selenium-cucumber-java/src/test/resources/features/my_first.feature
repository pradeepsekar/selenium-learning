Feature: Gmail Login 
	As a user I should able to login into Gmail.

@smoketest 
Scenario: I login with valid credential 
	Given I navigate to "http://the-internet.herokuapp.com/login"  
	And I enter "tomsmith" into input field having id "username" 
	And I enter "SuperSecretPassword!!" into input field having id "password" 
	When I click on element having class "radius" 
	Then I wait 5 seconds for element having css "a[href='/logout']" to display 
	And I click on element having css "a[href='/logout']" 
	
@ignore 
Scenario: I search some string in google 
	Given I navigate to "http://www.google.com" 
	And I enter "java" into input field having id "lst-ib" 
	And I wait 5 seconds for element having name "btnK" to be enabled 
	And I click on element having name "btnK" 
	
	
@ignore 
Scenario: I find data from google 
	Given I navigate to "http://www.google.com" 
	And I enter search text into input field 
		|java|
		|javascript|
	Then I click on element having id "sbse1" 
	And I wait 5 seconds for element having name "btnK" to be enabled 
	Then I click on element having name "btnK" 
	Then I close browser 
	
@ignore 
Scenario Outline: 
	Given I navigate to "http://www.google.com" 
	And I enter "<searchtext>" into input field having id "lst-ib" 
	And I click on element having id "sbse1" 
	And I wait 5 seconds for element having name "btnK" to be enabled 
	Then I click on element having name "btnK" 
	Then I navigate back 
	Examples: 
		|searchtext|
		|java|
		|javascript|
		
		
		
  	
Feature: Login to amazon

Scenario: I am on amazon.com landing page
	When I am on application home page
	Then I click on sign in link

Scenario: I am on amazon.com page
	When I enter login name as "8095456892"
	And I click on continue
	
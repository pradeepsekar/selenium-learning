Feature: Login to amazon

Scenario: I am logging amazon website
	When I enter the url as "https://www.amazon.in/"
	Then Takescreen shot of the page
	Then Check for the search box with id as "twotabsearchtextbox"
	Then Check the value of the cart with id as "nav-cart-count"
	Then Enter the value inside the search box with id "twotabsearchtextbox" as "jewellery sets for women"
	And click on the search button with class name "nav-input"
	Then Takescreen shot of the page
 
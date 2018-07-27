package com.amazon.automation.stepdefinitions;

import com.amazon.automation.managers.PageObjectManager;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class LoginPageSteps {

	private static PageObjectManager pageObjectManager = PageObjectManager.getPageObjectManagerInstance();
	
	@When("^I am on application home page$")
	public void navigateToPage() {
		pageObjectManager.getLoginPageObjects().navigateToHome();
	}
	
	@And("^I click on sign in link$")
	public void clickOnSignIn() {
		pageObjectManager.getLoginPageObjects().clickOnSignInLink();
	}
	
	@When("^I enter login name as \"([^\"]*)\"$")
	public void fillNameValueLogin(String name) {
		pageObjectManager.getAmazonLoginObjects().fillNameValue(name);
	}
	
	@And("^I click on continue$")
	public void clickOnContinue()
	{
		pageObjectManager.getAmazonLoginObjects().enterContinue();
	}
}

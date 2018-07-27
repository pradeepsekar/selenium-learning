package com.amazon.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class LoginPageObjects {

	private WebDriver driver;
	
	@FindBy(how = How.ID, id = "nav-link-yourAccount")
	private WebElement signInLink;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInLink() throws ElementNotFoundException {
		if(this.signInLink == null) {
			throw new ElementNotFoundException("Sign In Link", "Sign In link", "");
		} else {
			this.signInLink.click();
		}
	}
	
	public void navigateToHome() {
		driver.get("http://www.amazon.in");
	}

}

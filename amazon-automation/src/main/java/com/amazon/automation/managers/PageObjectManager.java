package com.amazon.automation.managers;

import org.openqa.selenium.WebDriver;

import com.amazon.automation.pageobjects.AmazonLoginPageObjects;
import com.amazon.automation.pageobjects.LoginPageObjects;

public class PageObjectManager {

	private WebDriver driver;
	private LoginPageObjects loginPageObjects;
	private AmazonLoginPageObjects amazonobjects;

	public PageObjectManager() {
		this.driver = new WebDriverManager().getDriver();
	}

	public LoginPageObjects getLoginPageObjects() {
		if (null == loginPageObjects) {
			this.loginPageObjects = new LoginPageObjects(driver);
		}
		return this.loginPageObjects;
	}

	public AmazonLoginPageObjects getAmazonLoginObjects() {
		if (null == amazonobjects) {
			this.amazonobjects = new AmazonLoginPageObjects(driver);
		}
		return amazonobjects;
	}

	public static PageObjectManager getPageObjectManagerInstance() {
		return new PageObjectManager();
	}
}

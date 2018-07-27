package com.amazon.automation.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class AmazonLoginPageObjects 
{
	WebDriver driver;
	@FindBy(how=How.ID,using="ap_email")
	WebElement email;
	
	@FindBy(how=How.ID,using="continue")
	WebElement subcontinue;

	public AmazonLoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void fillNameValue(String name) throws ElementNotFoundException
	{
		if(this.email==null)
		{
			throw new ElementNotFoundException("email","Email","");
		}
		else
		{
			email.clear();
			email.sendKeys(name);
		}
		
	}
	public void enterContinue()
	{
		if(this.subcontinue==null)
		{
			throw new ElementNotFoundException("Continue","Continue","");
		}
		else
		{
			subcontinue.click();
		}
	}
}

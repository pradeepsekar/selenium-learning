package com.amazon.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:features",
		glue= {"com.amazon.stepdefinitions"})

public class RunCucumberTest 
{
	
}

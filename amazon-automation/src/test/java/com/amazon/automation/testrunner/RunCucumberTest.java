package com.amazon.automation.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "com.amazon.automation.stepdefinitions" })
public class RunCucumberTest {

}

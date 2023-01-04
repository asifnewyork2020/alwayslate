package com.expedia.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "features",
		glue = "com.expedia.stepdef", 
		tags = "@UserRegistration",
		plugin = "pretty"
		
		)


public class testunner extends AbstractTestNGCucumberTests {

}

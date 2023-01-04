package com.expedia.stepdef;

import com.expedia.common.flightbase;
import com.expedia.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginexpedia extends flightbase {
	
	
	Homepage hp;
	
	@Given("^I am on a homepage$")
	public void i_am_on_a_homepage()  {
	  
		launchBrowser();
		
		
	}

	@When("^I click on register link$")
	public void i_click_on_register_link()  {
		
		hp = new Homepage(driver);
		hp.clickregister();
	 
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)"$")"
	public void i_enter_and(String arg1, String arg2) {
	   
	}

	@When("^I click submit button$")
	public void i_click_submit_button()  {
		
		
		
	   
	}

	@Then("^I get sucessful user registration notification$")
	public void i_get_sucessful_user_registration_notification()  {
	 
	}


}

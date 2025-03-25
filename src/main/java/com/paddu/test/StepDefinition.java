package com.paddu.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	
	//In the context of BDD (Behavior-Driven Development), a Step Definition file is used in conjunction with Gherkin syntax 
	//to map human-readable test scenarios to executable code. In Cucumber (a popular BDD tool for testing), 
	//the Step Definition file contains the logic for each step defined in a Gherkin feature file.

	//Here’s an example of how to structure a Step Definition file in Cucumber using Selenium WebDriver for UI testing.

	@Given("user navigates to the website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() {
		System.out.println("Navigating to the website javatpoint.com");
	}

	@Given("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String username,
			String password) {
		System.out.println("User is logging in with Username: " + username + " and Password: " + password);
	}

	@Then("login must be successful.")
	public void login_must_be_successful() {
		System.out.println("Login must be successful.");
	}
}

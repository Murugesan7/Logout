package org.stepdefinition;

import java.io.Closeable;

import org.base.BaseClass;
import org.base.GMailPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeGMail extends BaseClass {
	GMailPOJO g;
	
	@Given("User has to launch thebrowser and maximize the window.")
	public void user_has_to_launch_thebrowser_and_maximize_the_window() {
	   launchBrowser();
	}

	@When("User has to hit the gmail url")
	public void user_has_to_hit_the_gmail_url() {
		Url("https://accounts.google.com/");
	}

	@When("User has pass the datas {string} in email field.")
	public void user_has_pass_the_datas_in_email_field(String email) {
	    g = new GMailPOJO();
	    Passtxt(email, g.getEmail());
	}

	@When("User has to Click the Next Button.")
	public void user_has_to_Click_the_Next_Button() {
	 g = new GMailPOJO();
	 Click(g.getNext());
	}

	@When("User as pass the datas {string} in password field.")
	public void user_as_pass_the_datas_in_password_field(String string) {

	}

	@When("User has to Click the Login Button.")
	public void user_has_to_Click_the_Login_Button() {
	   
	}

	@Then("User has to Close the Browser.")
	public void user_has_to_Close_the_Browser() {
	   close();
	}

}

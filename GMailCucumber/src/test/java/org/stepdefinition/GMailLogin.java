package org.stepdefinition;

import org.base.BaseClass;
import org.base.GMailPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GMailLogin extends BaseClass {
	GMailPOJO g;

	@Given("To Launch the Chrome Browser and maximize the window.")
	public void to_Launch_the_Chrome_Browser_and_maximize_the_window() {
		launchBrowser();
	}

	@When("To launch the url of the GMail Application.")
	public void to_launch_the_url_of_the_GMail_Application() {
		Url("https://accounts.google.com/");
	}

	@When("To Pass the Valid EMail in Email Field.")
	public void to_Pass_the_Valid_EMail_in_Email_Field() {
		g = new GMailPOJO();
		Passtxt("naanjil.murugesan@gmail.com", g.getEmail());
	}

	@When("To Click the Next Button.")
	public void to_Click_the_Next_Button() {
		g = new GMailPOJO();
		Click(g.getNext());
	}

	@When("To Pass the Invalid Password in the Password Field.")
	public void to_Pass_the_Invalid_Password_in_the_Password_Field() {

	}

	@When("To Click the Submit Button.")
	public void to_Click_the_Submit_Button() {

	}

	@Then("To Close the Entire Browser.")
	public void to_Close_the_Entire_Browser() {
		close();
	}

}

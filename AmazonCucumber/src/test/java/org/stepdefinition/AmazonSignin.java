package org.stepdefinition;

import java.util.List;

import org.base.AmazonPOJO;
import org.base.AmazonSigninPOJO;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonSignin extends BaseClass {

	AmazonSigninPOJO a;

	@Given("User has to launch the Browser and maximize the window.")
	public void userHasToLaunchTheBrowserAndMaximizeTheWindow() {
	launchBrowser();
	}

	@When("user has to launch the url of amazon application")
	public void userHasToLaunchTheUrlOfAmazonApplication() {
		Url("https://www.amazon.in/");
	}

	@When("To click the Signin Menu.")
	public void toClickTheSigninMenu() {
		a = new AmazonSigninPOJO();
		Click(a.getSignAccount());
	}

	@When("User to pass the emailid in email text box.")
	public void userToPassTheEmailidInEmailTextBox(DataTable d) throws InterruptedException {
		a = new AmazonSigninPOJO();
		Thread.sleep(2000);
		List<String> l = d.asList();
		Passtxt(l.get(0), a.getMobileNo());

	}

	@When("User to hit the Continue button.")
	public void userToHitTheContinueButton() {
		a = new AmazonSigninPOJO();
		Click(a.getSignInButton());
	}

	@Then("User to close the entire browser.")
	public void userToCloseTheEntireBrowser() throws InterruptedException {
		Thread.sleep(2000);
		close();
	}
}

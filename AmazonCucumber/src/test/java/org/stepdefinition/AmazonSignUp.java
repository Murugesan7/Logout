package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.AmazonSigninPOJO;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonSignUp extends BaseClass {

	AmazonSigninPOJO a;

	@Given("To Launch the Browser and maximize the window.")
	public void toLaunchTheBrowserAndMaximizeTheWindow() {
		// launchBrowser();
	}

	@When("To launch the url of amazon application")
	public void toLaunchTheUrlOfAmazonApplication() {
		Url("https://www.amazon.in/");
	}

	@When("To click the create new amazon account button")
	public void toClickTheCreateNewAmazonAccountButton() throws InterruptedException {
		a = new AmazonSigninPOJO();
		Click(a.getSignAccount());
		Thread.sleep(3000);
		Click(a.getSignInButton());
	}

	@When("To pass name in name text box.")
	public void toPassNameInNameTextBox(DataTable d) throws InterruptedException {
		Thread.sleep(2000);
		List<String> l = d.asList();
		a = new AmazonSigninPOJO();
		Passtxt(l.get(0), a.getName());
	}

	@When("To pass mobile no in mobile no text box.")
	public void toPassMobileNoInMobileNoTextBox(DataTable d) {
		a = new AmazonSigninPOJO();
		Map<String, String> m = d.asMap(String.class, String.class);
		Passtxt(m.get("mobile2"), a.getMobileNo());
	}

	@When("To pass email in email text box.")
	public void toPassEmailInEmailTextBox(DataTable d) {
		a = new AmazonSigninPOJO();
		List<List<String>> l = d.asLists();
		Passtxt(l.get(1).get(0), a.getEmailId());
	}

	@When("To pass the password in password text box.")
	public void toPassThePasswordInPasswordTextBox(DataTable d) {
		a = new AmazonSigninPOJO();
		List<Map<String, String>> m = d.asMaps();
		Passtxt(m.get(1).get("password1"), a.getPassword());
		
	}

	@Then("To close the Chrome Browser.")
	public void toCloseTheChromeBrowser() throws InterruptedException {
//		Thread.sleep(2000);
//		close();
	}

}

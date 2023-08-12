package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BankPOJO;
import org.base.BaseClass;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class BankLogin extends BaseClass {

	BankPOJO b;

	@When("user has to launch the url of para bank application")
	public void userHasToLaunchTheUrlOfParaBankApplication() {
		Url("https://parabank.parasoft.com/");
	}

	@When("User to pass the username in username text box.")
	public void userToPassTheUsernameInUsernameTextBox(DataTable d) {

		b = new BankPOJO();
		List<String> l = d.asList();
		Passtxt(l.get(1), b.getlUsername());
	}

	@When("User to pass the password in password text box.")
	public void userToPassThePasswordInPasswordTextBox(DataTable d) {
		b = new BankPOJO();
		Map<String, String> m = d.asMap(String.class, String.class);
		Passtxt(m.get("password2"), b.getlPassword());
	}

	@When("User to hit the Login button.")
	public void userToHitTheLoginButton() {
		b = new BankPOJO();
		Click(b.getLogin());

	}

}

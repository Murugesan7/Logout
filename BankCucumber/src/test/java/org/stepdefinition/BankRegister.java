package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BankPOJO;
import org.base.BaseClass;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class BankRegister extends BaseClass {
	
	BankPOJO b;
	
	@When("To launch the url of para bank application")
	public void toLaunchTheUrlOfParaBankApplication() {
		 Url("https://parabank.parasoft.com/");
	}

	@When("To click the create new Register button")
	public void toClickTheCreateNewRegisterButton() {
	   b = new BankPOJO();
	   Click(b.getRegister());
	}

	@When("To pass first name in first name text box.")
	public void toPassFirstNameInFirstNameTextBox(DataTable d) {
		b = new BankPOJO();
		List<String> l = d.asList();
		Passtxt(l.get(1), b.getFirstName());
	}

	@When("To pass last name in last name text box.")
	public void toPassLastNameInLastNameTextBox(DataTable d) {
		b = new BankPOJO();
		List<String> l = d.asList();
		Passtxt(l.get(0), b.getLastName());
	}

	@When("To pass address in address text box.")
	public void toPassAddressInAddressTextBox(DataTable d) {
		b = new BankPOJO();
		List<String> l = d.asList();
		Passtxt(l.get(2), b.getAddress());
	}

	@When("To pass mobile no in mobile no text box.")
	public void toPassMobileNoInMobileNoTextBox(DataTable d) {
		b = new BankPOJO();
		Map<String,String> m = d.asMap(String.class, String.class);
		Passtxt(m.get("mobile2"), b.getPhone());
	}

	@When("To pass username in username text box.")
	public void toPassUsernameInUsernameTextBox(DataTable d) {
		b = new BankPOJO();
		List<List<String>> l = d.asLists(String.class);
		Passtxt(l.get(1).get(0), b.getUserName());
	}

	@When("To pass the password in password text box.")
	public void toPassThePasswordInPasswordTextBox(DataTable d) {
		b = new BankPOJO();
		List<Map<String,String>> m =d.asMaps(String.class,String.class);
		Passtxt(m.get(1).get("password2"), b.getPassword());
	}

	@When("To pass the conform password in conform password text box.")
	public void toPassTheConformPasswordInConformPasswordTextBox(DataTable d) {
		b = new BankPOJO();
		List<Map<String,String>> m =d.asMaps(String.class,String.class);
		Passtxt(m.get(1).get("password2"), b.getConform());
	}


}

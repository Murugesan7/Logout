package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.base.MynthraPOJO;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MynthraLogin extends BaseClass {

	MynthraPOJO m;
	
	@When("user has to launch the url of mynthra application")
	public void userHasToLaunchTheUrlOfMynthraApplication() {
		 Url("https://www.similarweb.com/");
	}

	@When("To click the Signin Menu.")
	public void toClickTheSigninMenu() throws InterruptedException {
	  m = new MynthraPOJO();
	  Click(m.getSignInOption());
	  Thread.sleep(2000);
	}

	@When("User to pass the mobile no in mobile no text box.")
	public void userToPassTheMobileNoInMobileNoTextBox(DataTable d) throws InterruptedException {
		m = new MynthraPOJO();
		Thread.sleep(2000);
		List<String> l = d.asList();
		Passtxt(l.get(1), m.getEmail());
		
	}

	@When("User to hit the Continue button.")
	public void userToHitTheContinueButton() {
		m = new MynthraPOJO();
		Click(m.getContinuee());
	}
}

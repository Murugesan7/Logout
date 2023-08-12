package org.stepdefinition;
import org.base.BaseClass;
import org.base.FlipkartPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLogin extends BaseClass {
	
	@Given("To Launch the Chrome Browser and Maximize the Window.")
	public void to_Launch_the_Chrome_Browser_and_Maximize_the_Window() {
	  launchBrowser();
	}

	@When("To Launch the url of the Flipkart Application.")
	public void to_Launch_the_url_of_the_Flipkart_Application() {
	  Url("https://www.flipkart.com/");
	}

	@When("To Click the Signin Button.")
	public void to_Click_the_Signin_Button() {
//	  FlipkartPOJO f = new FlipkartPOJO();
//	  Click(f.getSignin());
	}

	@When("To Pass the Valid email in Email Field and Click the getOTP request Button.")
	public void to_Pass_the_Valid_email_in_Email_Field_and_Click_the_getOTP_request_Button() {
		FlipkartPOJO f = new FlipkartPOJO();
		Passtxt("naanjil.murugesan@gmail.com", f.getEmail());
		Click(f.getRequestOTP());
	
	}

	@When("To Pass the Invalid Mobile No in Mobile No Field.")
	public void to_Pass_the_Invalid_Mobile_No_in_Mobile_No_Field() throws InterruptedException {
		Thread.sleep(5000);
		FlipkartPOJO f = new FlipkartPOJO();
	    Passtxt("1234567890", f.getMobile());
		
	}

	@When("To Click the Next Button.")
	public void to_Click_the_Next_Button() throws InterruptedException {
		Thread.sleep(3000);
		FlipkartPOJO f = new FlipkartPOJO();
		Click(f.getContinuebtn());
	}

	@When("To Check Whether Navigate to Signup or not.")
	public void to_Check_Whether_Navigate_to_Signup_or_not() {
	   
	}

	@Then("To Close the Browser.")
	public void to_Close_the_Browser() throws InterruptedException {
	 Thread.sleep(5000);
	 close();
	}

}

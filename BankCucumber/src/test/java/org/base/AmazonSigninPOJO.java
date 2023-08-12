package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSigninPOJO extends BaseClass {

	public AmazonSigninPOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@id='createAccountSubmit']")
	private WebElement signInButton;
	
	@FindBy(xpath = "//input[@name='customerName']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement mobileNo;
	
	@FindBy(xpath = "//input[@name='secondaryLoginClaim']")
	private WebElement emailId;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement signUpButton;

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement SignAccount;
	
	
	

	public WebElement getSignAccount() {
		return SignAccount;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}
	
	
	
}

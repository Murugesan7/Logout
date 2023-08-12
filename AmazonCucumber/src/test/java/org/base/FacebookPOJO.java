package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPOJO extends BaseClass {
	public FacebookPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement login;
	
	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement signuppage;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(name = "reg_email__")
	private WebElement emailormobile;
	
	@FindBy(name = "reg_passwd__")
	private WebElement pasword;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[2]")
	private WebElement genderMale;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[1]")
	private WebElement genderFemale;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[3]")
	private WebElement genderCustom;
	
	@FindBy(xpath = "//button[@class='_6j mvm _6wk _6wl _58mi _6o _6v']")
	private WebElement SignupSubmit;
	
	
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailormobile() {
		return emailormobile;
	}

	public WebElement getPasword() {
		return pasword;
	}

	public WebElement getGenderMale() {
		return genderMale;
	}

	public WebElement getGenderFemale() {
		return genderFemale;
	}

	public WebElement getGenderCustom() {
		return genderCustom;
	}

	public WebElement getSignupSubmit() {
		return SignupSubmit;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public WebElement getSignuppage() {
		return signuppage;
	}
}

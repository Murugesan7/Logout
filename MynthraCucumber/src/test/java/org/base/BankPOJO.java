package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankPOJO extends BaseClass {
	public BankPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@class='input'])[1]")
	private WebElement lUsername;
	
	@FindBy(xpath = "(//input[@class='input'])[2]")
	private WebElement lPassword;

	@FindBy(xpath = "//input[@class='button']")
	private WebElement Login ;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement Register ;
	
	@FindBy(xpath = "(//input[@class='input'])[3]")
	private WebElement firstName;

	@FindBy(xpath = "(//input[@class='input'])[4]")
	private WebElement lastName;
	
	@FindBy(xpath = "(//input[@class='input'])[5]")
	private WebElement address;
	
	@FindBy(xpath = "(//input[@class='input'])[9]")
	private WebElement phone;
	
	@FindBy(xpath = "(//input[@class='input'])[11]")
	private WebElement userName;
	
	@FindBy(xpath = "(//input[@class='input'])[12]")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@class='input'])[13]")
	private WebElement conform;

	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getlUsername() {
		return lUsername;
	}

	public WebElement getlPassword() {
		return lPassword;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConform() {
		return conform;
	}
	
	
}

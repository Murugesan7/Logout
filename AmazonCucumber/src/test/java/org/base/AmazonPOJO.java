package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOJO extends BaseClass {
	public AmazonPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBar;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement requestOtp;

	@FindBy(xpath = "(//a[@data-nav-role='signin'])[1]")
	private WebElement signinBtn;
	
	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	private WebElement emailBox;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getRequestOtp() {
		return requestOtp;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmailBox() {
		return emailBox;
	}

	


	
}

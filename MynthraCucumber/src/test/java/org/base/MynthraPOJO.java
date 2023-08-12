package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MynthraPOJO extends BaseClass {

	public MynthraPOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class='app-header__action-button'])[1]")
	private WebElement signInOption;
	
	@FindBy(xpath = "//button[@data-testid='sign-in']")
	private WebElement createAccount;
	
	@FindBy(xpath = "//input[@name='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "(//p[@class='sc-dkrFOg bMvWRq'])[1]")
	private WebElement continuee;
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@aria-label='Search icon']")
	private WebElement searchButton;

	public WebElement getSignInOption() {
		return signInOption;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
}

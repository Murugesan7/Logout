package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPOJO extends BaseClass {
	public FlipkartPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement requestOTP;

	@FindBy(xpath = "(//a[@class='_1TOQfO'])[1]")
	private WebElement signin;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getRequestOTP() {
		return requestOTP;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	
}
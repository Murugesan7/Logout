package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GMailPOJO extends BaseClass {

	public GMailPOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "identifierId")
	private WebElement email;	

	@FindBy(xpath = "(//span[@class='VfPpkd-vQzf8d'])[2]")
	private WebElement next;

	
	public WebElement getEmail() {
		return email;
	}


	public WebElement getNext() {
		return next;
	}
	
}

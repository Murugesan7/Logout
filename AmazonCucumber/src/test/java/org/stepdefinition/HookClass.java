package org.stepdefinition;
import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before(order=2, value="@Sanity")
	//Pre conditions
	public void precondition1() {
	  System.out.println("Browser Launched Successfully");
	}
	
	@Before(order=1,value="@Sanity")
	public void precondition2() {
		  launchBrowser();
		}
	
	@Before(order=3, value="@Sanity")
	public void precondition() {
		 System.out.println("Browser Window Maxmized Successfully");
		}

	@After(order=10, value="@Sanity")
	//post conditions
	public void postconditions1() throws InterruptedException {
		Thread.sleep(5000);
	}
	@After(order=8, value="@Sanity")
	public void postconditions2() {
	close();
	}
	
	@After(order=5, value="@Sanity")
	public void postconditions3() {
	System.out.println("Browser Closed Successfully");

}
}
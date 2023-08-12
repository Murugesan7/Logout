package org.base;

import org.testng.annotations.Test;

public class Demo extends BaseClass{
	@Test
	public void tc1() throws InterruptedException {
	
		
		launchBrowser();
		Url("https://www.google.com/");
		Thread.sleep(5000);
		close();
			
	}

}

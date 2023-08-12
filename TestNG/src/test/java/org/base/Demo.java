package org.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends BaseClass{
	@Test
	public void tc1() throws InterruptedException {
	
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Url("https://accounts.google.com/");
//		Thread.sleep(5000);
//		close();
			
		GMailPOJO g = new GMailPOJO();
		Passtxt("naanjil.murugesan@gmail.com", g.getEmail());
		Click(g.getNext());
	}

}

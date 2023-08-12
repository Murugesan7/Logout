package com.demo;
import org.base.AmazonPOJO;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossTesting extends BaseClass{
	@Parameters("browser")
	@Test
	public void tc1(String browserName) throws InterruptedException {
		WebDriver driver;
		AmazonPOJO f;
		
		if(browserName.equalsIgnoreCase("chromebrowser")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefoxbrowser")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		
		else {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		f = new AmazonPOJO();
		driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"))
		.sendKeys("naanjil.murugesan@gmail.com");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
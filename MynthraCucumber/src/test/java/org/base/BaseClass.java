package org.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void Url(String url) {
		driver.get(url);
	}

	public static void Passtxt(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}
	
	public static String getTitle() {
		
		return driver.getCurrentUrl();
		
	}

	public static void Click(WebElement ele) {
		ele.click();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void close() {
		driver.quit();
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	
	

}


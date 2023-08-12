package org.inmakesinfo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FirstTest {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName","Andriod");
		cap.setCapability("platformVersion","10");
		cap.setCapability("deviceName","Redmi 9 Power");
		cap.setCapability("udid","c8cb05831220");
		cap.setCapability("appPackage","com.miui.calculator\r\n");
		cap.setCapability("appAcitvity","com.miui.calculator.cal.CalculatorActivity - Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		 driver = new AndroidDriver(url,cap);
		 
		
	}

}

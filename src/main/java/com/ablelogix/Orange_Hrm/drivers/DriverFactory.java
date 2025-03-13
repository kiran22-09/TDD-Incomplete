package com.ablelogix.Orange_Hrm.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver createDriver(String browser) {
		WebDriver driver = null;
		
		switch(browser) {
		
		case  "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			break;
			
		default:
			throw new IllegalStateException("Unsupported Exception"+browser);
		}
		
		return driver;
	}

}

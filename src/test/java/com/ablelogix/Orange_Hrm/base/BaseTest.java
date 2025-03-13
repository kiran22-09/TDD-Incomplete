package com.ablelogix.Orange_Hrm.base;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class BaseTest {
	
	WebDriver driver;
	
	
	//Entering text with FluentWait and validation
	 protected void enterText(By locator, String text) {
		 WebElement element = driver.findElement(locator);
		 element.clear();
		 element.sendKeys(text);
		 validateInputValue(element , text);
	 }

	private void validateInputValue(WebElement element, String expectedValue) {
		// TODO Auto-generated method stub
		
		String actualValue = element.getAttribute("value");
		if(!actualValue.equals (expectedValue)) {
			throw new RuntimeException("Text input mismatch: Ecpected " + expectedValue + " , but found " + actualValue + " ");
		}
		
	}
	
	//Click button with FluentWait and Validation 
	protected void clickButton(By locator) {
		WebElement button = driver.findElement(locator);
		button.click();
		
	}
	
	@Test

	public void f() {
		
	}
	
	
	

}

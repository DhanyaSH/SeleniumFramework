package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BrowserUtility {
	
	private WebDriver wd;

	public BrowserUtility(WebDriver wd) {
		super();
		this.wd = wd;
	}

	public void goToWebsite(String url) {
		wd.get(url);

	}

	public void viewInfullScreen() {

		wd.manage().window().maximize();

	}

	public void enterText(By Locator, String textToEnter) {
		WebElement userNameTextBoxWebElement = wd.findElement(Locator);
		userNameTextBoxWebElement.clear();
		userNameTextBoxWebElement.sendKeys();
	}

	public void clickOn(By locator) {
		WebElement userNameTextBoxWebElement = wd.findElement(locator);
		userNameTextBoxWebElement.click();
		
	}
	public void sleepFor(int seconds) {
	
	try {
		Thread.sleep(seconds*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
		
		
}	
		
	
	
	

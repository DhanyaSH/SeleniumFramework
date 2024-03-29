package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

public abstract class BrowserUtility {

	private WebDriver wd;

	private WebDriverWait wait;

	public BrowserUtility(WebDriver wd) {
		super();
		this.wd = wd;
		wait = new WebDriverWait(wd, java.time.Duration.ofSeconds(30));
	}

	public void goToWebsite(String url) {
		wd.get(url);

	}

	public void viewInfullScreen() {

		wd.manage().window().maximize();

	}

	public void enterText(By Locator, String textToEnter) {
		WebElement userNameTextBoxWebElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		userNameTextBoxWebElement.clear();
		userNameTextBoxWebElement.sendKeys(textToEnter);
	}

	public void clickOn(By locator) {
		WebElement userNameTextBoxWebElement = wait.until(ExpectedConditions.elementToBeClickable(locator));
		userNameTextBoxWebElement.click();

	}

	public String getVibileText(By locator) {

		WebElement iconInloginpagElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		String iconInloginpagElementText = iconInloginpagElement.getText();
		return iconInloginpagElementText;

	}

	public void sleepFor(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

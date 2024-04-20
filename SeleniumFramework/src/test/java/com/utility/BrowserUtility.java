package com.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.protobuf.Duration;

import io.github.bonigarcia.wdm.WdmAgent;

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
	
	public void searchandclickOn(By locator ,String text) {
WebElement searchandclick = wait.until(ExpectedConditions.elementToBeClickable(locator));
List<WebElement>elements =	searchandclick.findElements(locator);
for(WebElement options: elements) {
	
	if(options.getText().equals(text)) {
		
		options.click();
		break;
		
	}
	
}}
	public String getVibileText(By locator) {

		WebElement iconInloginpagElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String iconInloginpagElementText = iconInloginpagElement.getText();
		return iconInloginpagElementText;

	}

	public List<WebElement> getmoduleList(By Locator) {

		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		List<WebElement> locator = ele1.findElements(Locator);

		for (WebElement e1 : locator) {

			System.out.println(e1.getText());

//			locator.get(1).click();
//			  break;

		}
		return locator;

	}

	public void getlogout(By LOCATOR) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(LOCATOR));
		List<WebElement> elements = element.findElements(LOCATOR);
		for(int i = 0;i<=elements.size();i++) {		
		System.out.println(elements.get(i).getText());
		elements.get(3).click();
		break;

	}
	}
	public String dispayErrorMessage(By Locator) {
		WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		return errorElement.getText();
	}

	public void teardown(WebDriver wd2) {
		wd.close();
		wd.quit();

	}

	
	public  String gettittle() {
	String  tittleString = wd.getTitle();
		return	tittleString ;
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

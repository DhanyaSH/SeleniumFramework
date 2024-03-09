package com.utility;

import org.openqa.selenium.WebDriver;



public class BrowserUtility {
private WebDriver wd;

public BrowserUtility(WebDriver wd) {
	super();
	this.wd = wd;
}

	public void goToWebsite(String url) {
	wd.get("https://freecrm.com/");
	
}
}
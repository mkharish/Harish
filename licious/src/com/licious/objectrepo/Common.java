package com.licious.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.licious.generc.WebdrivercommonUtils;

public class Common extends WebdrivercommonUtils{

	@FindBy(xpath="//a[@class='user']")
	private WebElement clkuser;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLnk;
	
	
	public void logout() {
		clkuser.click();
        waitForElemnetAndClick(logoutLnk);		
	}
}

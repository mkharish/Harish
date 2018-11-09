package com.licious.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.licious.generc.WebdrivercommonUtils;

public class Login {
	
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	//Webelemnets locator    // initialization  
	@FindBy(xpath="//a[@class='login-user']")
     private WebElement login; 
	
	@FindBy(xpath="//input[@class='user-id']")
    private WebElement phonenumber; 

	@FindBy(xpath="//button[text()='Proceed']")
    private WebElement proceed; 
	
	@FindBy(xpath="//li[text()='Password Login']")
	private WebElement pswdlogin;
	
	@FindBy(xpath="//input[@class='login-pass']")
	private WebElement entrpass;
	
	@FindBy(xpath="//button[@class='btns password-login enabled']")
	private WebElement clklog;
	
	
	/*//getters to provide single elements to test writter 
	public WebElement getErrorMsg() {
		return errorMsg;
		
		
	}*/
	/*public WebElement getLoginBtn() {
		return clklog;
	}*/
	//business Libraries         // usage
	public void login() {
		
		phonenumber.sendKeys("9535272188");
		entrpass.sendKeys("pradeep");
		clklog.click();
	}
	public void login(String username, String password) {
		wLib.waitForPageToLoad();
		login.click();
		phonenumber.sendKeys(username);
		proceed.click();
		pswdlogin.click();
		entrpass.sendKeys(password);
		clklog.click();
	}
	
}

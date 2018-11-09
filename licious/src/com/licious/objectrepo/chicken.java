package com.licious.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.licious.generc.WebdrivercommonUtils;

public class chicken {
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	@FindBy(xpath="//a[text()='Chicken']")
	private WebElement clickchicken;
	
	//@FindBy(xpath="//button[@data-text='Chicken (Skinless) - Curry Cut (Large)']")
	//private WebElement product;
	
	public void Chicken() {
			
		//wLib.waitForPageToLoad();
		clickchicken.click();
		//Thread.sleep(3000);
		//product.click();
	}

}

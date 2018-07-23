package com.licious.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class chicken {
	@FindBy(xpath="//a[text()='Chicken']")
	private WebElement chicken;
	
	@FindBy(xpath="//button[@data-text='Chicken (Skinless) - Curry Cut (Large)']")
	private WebElement product;
	
	public void Chicken() {	
		chicken.click();
		product.click();
	}

}

package com.licious.objectrepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import com.licious.generc.WebdrivercommonUtils;


public class location {
	public static WebDriver driver;
	
	WebdrivercommonUtils wlib = new WebdrivercommonUtils();
  
	@FindBy(id="location_pop")
	private WebElement selectloc;

	public void location(String loc) throws Throwable{
		
		selectloc.sendKeys(loc);
		//Thread.sleep(2000);
		selectloc.sendKeys(Keys.DOWN);
		selectloc.sendKeys(Keys.ENTER);
		wlib.waitForPageToLoad();
		
		
	}
	

}

package com.licious.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.licious.generc.WebdrivercommonUtils;


public class location {
	
	WebdrivercommonUtils wlib = new WebdrivercommonUtils();
  
	@FindBy(id="location_pop")
	private WebElement selectloc;

	public void Location(String loc) throws Throwable {
		wlib.waitForPageToLoad();
		selectloc.sendKeys(loc);
		
		//selectloc.sendKeys(Keys.ENTER);
		
	}
	

}

package testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class ClearPopup {
	
	public void clearPopup() throws InterruptedException {
		WebDriver driver = null;
	    driver.navigate().refresh();
	    Thread.sleep(2000);//wait until the page is loaded.
	    //try to use explicit wait

	     try {

	            Alert alert = driver.switchTo().alert();                
	            alert.dismiss();
	           } catch (NoAlertPresentException ex) {
	             //System.out.println("No alert for this test case.");
	           }        
	}

}

package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.licious.generc.BaseClass;
import com.licious.generc.FileDataUtiles;
import com.licious.generc.WebdrivercommonUtils;
import com.licious.objectrepo.chicken;
import com.thoughtworks.selenium.webdriven.commands.Click;


public class CustomerTest extends BaseClass{
	
	FileDataUtiles file = new FileDataUtiles();
    WebdrivercommonUtils wLib = new WebdrivercommonUtils();
    chicken chk = new chicken();

	@Test
	public void createCustomerTest() throws Throwable {
	//select chicken category
		chk.Chicken();
		
		
	}
	
	/*@Test
	public void createCustomerWitDecTest() throws Throwable {
		//read the data
		String customerName = file.getExcelData("Sheet1", 5, 2);
		String customerNameDesp = file.getExcelData("Sheet1", 5, 3);
		//step2 : navigate to Task Page
		Home hp = PageFactory.initElements(driver,Home.class);
		//wLib.waitForElemnetToVisible(hp.getTaskImg());
		hp.navigateToTaskPage();
		//step 3 : navigate to create customer Page
		Task tp= PageFactory.initElements(driver, Task.class);
		tp.naviagteToCustomerPage();
		//step 4 : create cuatomer
		CreateNewcustomer cp = PageFactory.initElements(driver, CreateNewcustomer.class);
		cp.createCustomer(customerName, customerNameDesp);
	}*/
	
	
	

}







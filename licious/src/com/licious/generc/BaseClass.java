package com.licious.generc;


import java.util.Properties;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.licious.objectrepo.Common;
import com.licious.objectrepo.Login;
import com.licious.objectrepo.location;

public class BaseClass {
	public static WebDriver driver; //global driver Object declaration 
	FileDataUtiles file = new FileDataUtiles();
	WebdrivercommonUtils wLib = new WebdrivercommonUtils();
	
	
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("=========launch browser======");
		Properties pObj = file.getPropertiesFileObj();
		String browserName  = pObj.getProperty("browser");
		if(browserName.equals("firefox")) {
		   driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Resources/IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}

	}	

	@BeforeMethod
	public void configBm() throws Throwable {
		Properties pObj = file.getPropertiesFileObj();
		

        wLib.waitForPageToLoad();
        String url =pObj.getProperty("url");
        driver.get(url);
	
      //location selection
        wLib.waitForPageToLoad();
        Actions act = new Actions(driver);
        location lo = PageFactory.initElements(driver,location.class);
        String loc = pObj.getProperty("location");
        lo.Location(loc);
        Thread.sleep(3000);
        act.sendKeys(Keys.ENTER).perform();
        
	
        //login
        System.out.println("login");
        Thread.sleep(3000);
        wLib.waitForPageToLoad();
        Login lp = PageFactory.initElements(driver, Login.class);
        String username =pObj.getProperty("username");
        String password = pObj.getProperty("password");
       lp.login(username, password);
       System.out.println("login success");
     
        
	}
	/*@AfterMethod
	public void configBM() {
		System.out.println("logout");
	  Common cPage = PageFactory.initElements(driver, Common.class);
	  cPage.logout();
	}
	@AfterClass
	public void configAC() {
		System.out.println("=====close browser========");
		driver.close();
	}*/
}

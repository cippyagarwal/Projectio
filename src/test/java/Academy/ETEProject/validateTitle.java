package Academy.ETEProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;


public class validateTitle extends base{
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test()
	public void basePageNavigation() throws IOException
	{
		//initializeDriver().get("https://www.qaclickacademy.com");
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	    LandingPage l = new LandingPage(driver); 
        
	   Assert.assertTrue(l.GetImagevalidation().isDisplayed());
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}

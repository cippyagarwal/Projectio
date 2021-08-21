package Academy.ETEProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.base;

public class ValidateBuynow extends base{
	
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test()
	public void validateBuynow() {
		LandingPage l = new  LandingPage(driver);
		Assert.assertTrue(l.getprice().isDisplayed());
		l.getbuynow().click();
		
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}


}

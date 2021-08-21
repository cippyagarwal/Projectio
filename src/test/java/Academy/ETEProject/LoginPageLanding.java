package Academy.ETEProject;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;

public class LoginPageLanding extends base {
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test()
		
		public void validateredirection() throws InterruptedException {
		// redirecting to login page 
		LandingPage l = new LandingPage(driver);
		Actions action = new Actions(driver);
        action.moveToElement(l.getQuicklink()).perform();
        l.getlogin().click();
		Thread.sleep(3000);	
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys("cippy.agarwal@gmail.com");
		lp.getPassword().sendKeys("12345");
		lp.getLogin().click();
		Thread.sleep(5000);
		Assert.assertTrue(lp.getloginvalidation().isDisplayed());
		

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
  
	

}

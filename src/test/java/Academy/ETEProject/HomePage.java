package Academy.ETEProject;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;


public class HomePage extends base{
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test
	public void basePageNavigation()
	{   //clicking on Button with values
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver); 
		l.getInputbox().sendKeys("Test", Keys.ENTER);
		//l.GetContestButton().click();
	}
	@Test
	public void basePageNavigationNoValues()
	{   //clicking on Button without values
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getInputbox().sendKeys("", Keys.ENTER);
		//l.GetContestButton().click();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}

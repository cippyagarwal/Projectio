package Academy.ETEProject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.base;


public class validateNavbar extends base{
	
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test()
	public void basePageNavigation() throws IOException, InterruptedException
	
	{     driver.navigate().to("https://www.squadhelp.com/premium-domains-for-sale/all/q/test");
	      Thread.sleep(3000);
		 // Validationg Whether menu is present or not
		 LandingPage l = new LandingPage(driver);
         Assert.assertTrue(l.getNavBar().isDisplayed());
         
         
	}
	@Test()
		
		public void menuoptionsclick() {
		
			//1. will hover on names and click on recommdention for you
		
		     LandingPage l = new LandingPage(driver);
	         Actions action = new Actions(driver);
	         action.moveToElement(l.GetNamesMenu()).perform();
	         l.GetClickonMenuoption().click();
			
		}
	@Test()
	public void getnamemenucount() {
		//1. Validate count in name menu 
	     LandingPage l = new LandingPage(driver);
	     List<WebElement> options=  l.GetCountNameMenu();
	    // System.out.println(options.size());
         Assert.assertEquals(31, options.size());		
	}
	       
	@AfterTest
	public void teardown() {
		driver.close();
	}

}

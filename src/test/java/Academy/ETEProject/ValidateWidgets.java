package Academy.ETEProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.base;

public class ValidateWidgets extends base{
	
	@BeforeTest
	public void init() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test()
	public void ValidatewidgetYoumaylike() {
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.GetWidgetYouMayLike().getText(), "You May Also Like");
		Assert.assertEquals(l.GetWidgetview().getText(), "Based On Your Recent Views");
		Assert.assertEquals(l.GetWidgetBasedOnProject().getText(), "Other Names Based On \"Project\"");
		Assert.assertEquals(l.GetWidgetBasedOnStategt().getText(), "Other Names Based On \"Strategy\"");
		Assert.assertEquals(l.GetWidgetBasedOnventure().getText(), "Other Names Based On \"Venture\"");
	}
	
	@Test()
	public void ValidteViewMoreOfWidget() throws InterruptedException {
		LandingPage l = new LandingPage(driver);
        l.ViewMoreOfYouMayAlsoLikeButton().click();
        Thread.sleep(5000);
        Assert.assertEquals(l.getViewmoreofyoumaylikevalidation().getText(), "Recommended For You");
	}
	/*
    @Test()
	public void validatewidgetsoptions() throws InterruptedException 
	//Validation widget options
	{
		LandingPage l = new LandingPage(driver);
    //l.GetYouMayLikeWidgetOption().click();
   // Thread.sleep(3000);
	l.GetYouMayLikeWidgetOption().click();
  //  Assert.assertEquals(l.getBetamaker().getText(), l.GetYouMayLikeWidgetOption().getText() );
	}
	*/
	

    @AfterTest
    public void teardown() {
	driver.close();
    }

}

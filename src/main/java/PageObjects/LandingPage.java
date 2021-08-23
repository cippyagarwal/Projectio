package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	/*By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	*/
	By Images = By.xpath("/html/body/div[1]/div[1]/div/a[1]/img");
	By NavBar =  By.xpath("/html/body/div[1]/div[3]/nav");
	By Inputbox =  By.id("sh-global-search");
	By Button =  By.xpath("/html/body/div[1]/div[1]/div/a[2]");
	By NamesMenu  =  By.xpath("/html/body/div[1]/div[3]/nav/div[1]/div[1]/a/span");
	By NameMenu_Recommendation = By.xpath("/html/body/div[1]/div[3]/nav/div[1]/div[2]/div/a[1]");
    By NavNameMenuCount =  By.xpath("//a[@class='sh-navbar--nav-link hover:text-brand-blue']");
    By YouMayAlsoLike_Widget =  By.xpath("//*[@id=\"recoms-widget\"]/div/div/div[1]/h3");
	By View_widget= By.xpath("//*[@id=\"views-widget\"]/div/div/div[1]/h3");
	By BasedOnProject_widget =  By.xpath("/html/body/div[3]/div/div/div[3]/h3");
	By BasedOnStategy_widget = By.xpath("/html/body/div[3]/div/div/div[12]/h3");
    By BasedOnventure_widget = By.xpath("/html/body/div[3]/div/div/div[22]");
    //By YoumaylikeOptionClick = By.xpath("//*[@id=\"recoms-widget\"]/div/div/div[8]/div");
    By viewMoreOfYouMayLike = By.xpath("//*[@id=\"recoms-widget\"]/div/div/div[14]/a");
    By Betamakervalidation = By.xpath("/html/body/div[2]/div/div[5]/div[2]/div[1]/div[1]/span");
    By validateViewMoreButtonOFYouMayLike = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div/h1");
    By YoumaylikeOptionClick = By.xpath("/html/body/div[3]/div/div/div[1]/div/div/div[2]");
    By SellingPrice  =  By.xpath("/html/body/div[2]/div/div[6]/div[2]/div[1]/div[2]");
    By BuynowCta = By.xpath("/html/body/div[2]/div/div[6]/div[2]/div[1]/div[3]/a");
    By Quicklink = By.xpath("//*[@id='before-login-div']");
    By loginlink = By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[1]/div/a[1]");
    
    public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
    }
/*
	public WebElement getLogin()
    {
    	return driver.findElement(signin);
    }
	public WebElement getTitle()
    {
    	return driver.findElement(title);
    }
    */
	public WebElement getNavBar()
    {
    	return driver.findElement(NavBar);
    }

    
    public WebElement getInputbox() {
    	return driver.findElement(Inputbox);
    }
    public WebElement GetContestButton() {
    	return driver.findElement(Button);
    }
    public WebElement GetImagevalidation() {
    	return driver.findElement(Images);
    }
    public WebElement GetNamesMenu() {
    	return driver.findElement(NamesMenu);
    }
    public WebElement GetClickonMenuoption() {
    	return driver.findElement(NameMenu_Recommendation);
    }
    public List<WebElement> GetCountNameMenu(){
    	return driver.findElements(NavNameMenuCount);
    }
    public WebElement GetWidgetYouMayLike() {
    	return driver.findElement(YouMayAlsoLike_Widget);
    }
    public WebElement GetWidgetview() {
    	return driver.findElement(View_widget);
    }
    public WebElement GetWidgetBasedOnProject() {
    	return driver.findElement(BasedOnProject_widget);
    }
    public WebElement GetWidgetBasedOnStategt() {
    	return driver.findElement(BasedOnStategy_widget);
    }
    public WebElement GetWidgetBasedOnventure() {
    	return driver.findElement(BasedOnventure_widget);
    }
    public WebElement GetYouMayLikeWidgetOption() {
    	return driver.findElement(YoumaylikeOptionClick);
    }
    public WebElement ViewMoreOfYouMayAlsoLikeButton() {
    	return driver.findElement(viewMoreOfYouMayLike);
    }
    public WebElement getBetamaker() {
    	return driver.findElement(Betamakervalidation);
    }
   public WebElement getViewmoreofyoumaylikevalidation() {
	   return driver.findElement(validateViewMoreButtonOFYouMayLike);
   }
   public WebElement getprice() {
	   return driver.findElement(SellingPrice);
   }
   public WebElement getbuynow() {
	   return driver.findElement(BuynowCta);
   }
   public WebElement getlogin() {
	   return driver.findElement(loginlink);
   }
   public WebElement getQuicklink() {
	   return driver.findElement(Quicklink);
   }
}


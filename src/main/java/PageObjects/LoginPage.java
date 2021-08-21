package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	By email = By.xpath("//*[@id=\"inputEmail\"]");
	By password = By.xpath("//*[@id=\"free_signup_container\"]/div/div[2]/div[3]/div/div[3]/div/input");
    By login = By.xpath("//*[@id=\"free_signup_container\"]/div/div[2]/div[3]/div/div[5]/div/button");
    By Validatelogin = By.xpath("/html/body/div[1]/div[2]/div/div[1]/ul/li[3]/a/span[2]/span");
    public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
    }

	public WebElement getEmail()
    {
    	return driver.findElement(email);
    }

	public WebElement getPassword()
    {
    	return driver.findElement(password);
    }
	public WebElement getLogin()
    {
    	return driver.findElement(login);
    }
    public WebElement getloginvalidation() {
    	return driver.findElement(Validatelogin);
    }
}

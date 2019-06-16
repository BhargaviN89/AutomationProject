package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class landingPage extends base{
	
	By login = By.cssSelector("a[href*='sign_in']");
		
	public landingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement login() throws IOException
	{
		return driver.findElement(login);
	}
	

}

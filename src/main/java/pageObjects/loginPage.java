package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class loginPage extends base{
	
	By username = By.id("user_email");
	By password = By.id("user_password");
	By login = By.cssSelector("input.btn.btn-primary.btn-md.login-button");
	
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(login);
		
	}

}

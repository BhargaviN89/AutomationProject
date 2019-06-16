package Academy;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("in initialize method");
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException {
		
		driver.get(prop.getProperty("URL"));
		landingPage l = new landingPage(driver);
		l.login().click();
		loginPage lp = new loginPage(driver);
		lp.username().sendKeys(Username);
		lp.password().sendKeys(Password);
		lp.loginButton().click();
		log.info("in basePageNavigation method");
		
	}	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "abc@qw.com";
		data[0][1] = "123";
		data[1][0] = "def@qw.com";
		data[1][1] = "456";
		data[2][0] = "ghi@qw.com";
		data[2][1] = "789";
		
		return data;
	}
		
		

}

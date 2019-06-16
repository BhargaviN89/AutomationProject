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

public class validation extends base{
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("URL"));
		log.info("in initialize method");
	}
	
	@Test()
	public void basePageNavigation() throws IOException {
		
		
		landingPage l = new landingPage(driver);
		String text = l.login().getText();
		Assert.assertEquals(text, "Login");
		log.info("in basePageNavigation method");
		
	}	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}

}

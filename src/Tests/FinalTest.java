package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BrowserInitialization.BrowserInit;
import Pages.FacebookLogin;

public class FinalTest {
	WebDriver driver;
	
	@Test
	public void FacebookTests(){
		
		driver = BrowserInit.OpenBrowser("chrome", "https://www.facebook.com");
		FacebookLogin fbLog = new FacebookLogin(driver);
		fbLog.EnterUserName("almnac@gmail.com");
		driver.quit();
	}

}

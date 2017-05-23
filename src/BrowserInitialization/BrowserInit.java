package BrowserInitialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInit {
	
	private static WebDriver driver;;
	public static WebDriver OpenBrowser(String browserName, String URL){
		
		if(browserName.equalsIgnoreCase("Firefox")){
			
			driver=new FirefoxDriver();
			driver.switchTo().parentFrame();
			
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\as251039\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.get("https://facebook.com");
		return driver;
		
	}

}

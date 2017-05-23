package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	
	WebDriver driver;

	@FindBy(id="email")
	WebElement email;
	
	public FacebookLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void EnterUserName(String text){
		
		email.sendKeys(text);
	}
	
}

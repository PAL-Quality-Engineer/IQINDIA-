 package automationFRMPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	WebDriver ldriver;
	
	public Sign_In(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	// locate the sign in  webelement 
	@FindBy(linkText="Sign In")
	WebElement Signin;
	
	
	// identify action on webelement
	
	public void ClickonSingin() {
		Signin.click();
		
	}
	

}

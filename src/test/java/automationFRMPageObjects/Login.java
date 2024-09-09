package automationFRMPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
		WebDriver ldriver;
		
		public Login(WebDriver rdriver) {
			ldriver=rdriver;
			
			PageFactory.initElements(rdriver, this);
			
			
		}
		
		// locate the username webelement 
		@FindBy(id="uid")
		WebElement username;
		
		
		// locate the password  webelement 
				@FindBy(id="passw")
				WebElement password;
				
				
				@FindBy(name="btnSubmit")
				WebElement button;
		
		
		// identify action on webelement
		
		public void Enterusername(String name) {
			username.sendKeys(name);
		}
		
		public void Enterpassword(String passw) {
			password.sendKeys(passw);
		}
		
		public void clickOnButton() {
			button.click();
			
		}
}

package automationFRMTest_Cases;

import automationFRMPageObjects.Login;
import automationFRMPageObjects.Sign_In;

public class TC_MyLoginPage extends BaseClass {

	public void verifyRegistractionAndLogin() {

		// open url
		driver.get(url);

		Sign_In sign = new Sign_In(driver);
		sign.ClickonSingin();

		Login lg = new Login(driver);
		lg.Enterusername("jsmith");
		lg.Enterpassword("demo1234");
		lg.clickOnButton();
	}

}

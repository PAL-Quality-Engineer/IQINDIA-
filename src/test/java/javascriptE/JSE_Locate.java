package javascriptE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSE_Locate {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		driver.get("http://testfire.net/login.jsp");
		// Useing Selenium with js locate Object
		WebElement username = driver.findElement(By.id("uid"));
		js.executeScript("arguments[0].value='jsmith'", username);

		// js.executeScript("document.getElementById('uid').value='jsmith'");
		js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
		js.executeScript("document.getElementsByName('btnSubmit')[0].style.border='13px double red'");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByTagName('input')[4].click()");
		
		
		

	}

}

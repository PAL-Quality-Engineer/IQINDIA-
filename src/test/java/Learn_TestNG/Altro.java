package Learn_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Altro {
	public static WebDriver driver;
	public static JavascriptExecutor js;

	@BeforeTest
	public void init() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js= (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	}

	@Test
	public void applunch() {

		driver.get("http://testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		WebElement pass = driver.findElement(By.id("passw"));
		js.executeScript("arguments[0].value='demo1234'", pass);
		driver.findElement(By.name("btnSubmit")).click();

	}
	
	@Test
	
	public void signoff() {
		WebElement singoff= driver.findElement(By.xpath("//font[text()='Sign Off']"));
		if(singoff.isDisplayed()) {
			System.out.println("User login is sucessfully page ");
		
		}
		else {
			
			
	System.out.println("user not login");
		}
		
	}
	
	
	@AfterTest
	public void appdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}

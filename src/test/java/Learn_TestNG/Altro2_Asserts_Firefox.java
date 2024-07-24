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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Altro2_Asserts_Firefox {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static SoftAssert Sf;

	@BeforeTest
	public void init() {

		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver = new FirefoxDriver();
		js= (JavascriptExecutor) driver;
		 Sf= new SoftAssert();
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
//		Boolean b= driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
//        Assert.assertEquals(b, false);
        String Expected="Hello John Smith";
		String Actule =driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).getText();
		//Heard assert used 
		//Assert.assertEquals(Actule, Expected, "user  login");
		
		//SoftAssert used 
		Sf.assertEquals(Actule, Expected, "user  login");
		Sf.assertAll();
	}
	
	
	@AfterTest
	public void appdown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}

package Learn_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practices {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions act;
	public static SoftAssert Sf;

	@BeforeTest
	public void Init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test(priority = -1)
	public void AppLounch() {

		driver.get("https://demoqa.com/");
//		
//		String Excepted= "© 2013-2020 TOOLSQA.COM | ALL";
//		
//	   boolean Actuel=driver.findElement(By.xpath("//span[text()='© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']")).isDisplayed();
//	   Assert.assertEquals(Actuel,Excepted,"User login");

	}

	@Ignore
	@Test(priority = 0)
	public void ElementTextBox() {

		driver.findElement(By.xpath("//div[@class='category-cards']/child::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Sintu kumar");
		driver.findElement(By.id("userEmail")).sendKeys("sintushina@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Gali number -4 kamal nagar kukra ");
		driver.findElement(By.id("permanentAddress")).sendKeys("Gali number -4 kamal nagar kukra");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Ignore
	@Test(priority = 1)
	public void CheckBox() {

		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
	}

	@Test(priority = 2)
	public void WebTable() {
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		js.executeScript("document.getElementById('firstName').value='vidul'");
		js.executeScript("document.getElementById('lastName').value='Pal'");
		js.executeScript("document.getElementById('userEmail').value='vidulpal07@gmail.com'");
		js.executeScript("document.getElementById('age').value='30'");
		js.executeScript("document.getElementById('salary').value='150000'");
		js.executeScript("document.getElementById('department').value='Quality Automation Engineer'");
		js.executeScript("document.getElementById('submit').click()");

	}

	@Test(priority = 3)
	public void EditWebTable() {

		driver.findElement(By.id("//span[@id='edit-record-1']")).click();
		js.executeScript("document.getElementById('firstName').value='Sintu'");
		js.executeScript("document.getElementById('lastName').value='Kumar'");
		js.executeScript("document.getElementById('userEmail').value='sintushina123@gmail.com'");
		js.executeScript("document.getElementById('submit').click()");

	}

	@AfterTest

	public void BrowserClosed() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

}

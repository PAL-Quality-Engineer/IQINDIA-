package Learn_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFirefordataprovider2WithExcelfileload {
	@Test(dataProvider="dataSend",dataProviderClass=workwithExcel.class)
	public void login(String uname,String pas) throws InterruptedException { 
		System.out.println(uname);
		System.out.println(pas);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.id("passw")).sendKeys(pas);
		driver.findElement(By.name("btnSubmit")).click();
		boolean b=driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
		Assert.assertTrue(b);
		Thread.sleep(2000);
		driver.close();

	}
}



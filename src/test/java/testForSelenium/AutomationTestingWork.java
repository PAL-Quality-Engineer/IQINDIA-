package testForSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingWork {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor ts=((JavascriptExecutor)driver);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ts.executeScript("document.getElementById('name').value='vidul pal'");
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("VIDUL PAL");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ts33675007@gmail.com");

	}

}

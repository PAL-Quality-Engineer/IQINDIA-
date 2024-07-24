package waitinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_Jquery {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Use WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text1")));
		we.sendKeys("Frist button is 5Secound");

		// Thread.sleep(5000);
//
//		driver.findElement(By.id("btn2")).click();
//		WebElement we1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text2")));
//		we1.sendKeys("Inside the 10 secound ");

		driver.findElement(By.id("btn2")).click();
		WebElement we2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text2")));
		we2.sendKeys("New custom");
	
		

	}

}

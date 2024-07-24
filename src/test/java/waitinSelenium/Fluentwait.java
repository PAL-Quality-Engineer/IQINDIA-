package waitinSelenium;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		Wait<WebDriver>wait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)
				.ignoring(NoSuchWindowException.class);
		
		driver.findElement(By.id("btn1")).click();
		WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text1")));
		we.sendKeys("Frist button is 5Secound");

		// Thread.sleep(5000);
//
//		driver.findElement(By.id("btn2")).click();
//		WebElement we1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("text2")));
//		we1.sendKeys("Inside the 10 secound ");
		
		driver.findElement(By.id("btn2")).click();
	WebElement we2=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text2")));
	we2.sendKeys("New custom 10 Secound ");
		
	}

}

package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://demoqa.com/");
//		driver.findElement(By.xpath("//div[@class='category-cards']/child::div[1]")).click();
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		driver.findElement(By.id("userName")).sendKeys("Sintu kumar");
//		driver.findElement(By.id("userEmail")).sendKeys("sintushina@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("Gali number -4 kamal nagar kukra ");
//		driver.findElement(By.id("permanentAddress")).sendKeys("Gali number -4 kamal nagar kukra");
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
//		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
//		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
//		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
//		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
//		driver.findElement(By.xpath("//button[text()='Add']")).click();
//		JavascriptExecutor js =((JavascriptExecutor)driver);
//		js.executeScript("document.getElementById('firstName').value='vidul'");
//		js.executeScript("document.getElementById('lastName').value='Pal'");
//		js.executeScript("document.getElementById('userEmail').value='vidulpal07@gmail.com'");
//		js.executeScript("document.getElementById('age').value='30'");
//		js.executeScript("document.getElementById('salary').value='150000'");
//		js.executeScript("document.getElementById('department').value='Quality Automation Engineer'");
//		js.executeScript("document.getElementById('submit').click()");
//		Thread.sleep(2000);
//		driver.findElement(By.id("//span[@id='edit-record-1']")).click();
//		js.executeScript("document.getElementById('firstName').value='Sintu'");
//		js.executeScript("document.getElementById('lastName').value='Kumar'");
//		js.executeScript("document.getElementById('userEmail').value='sintushina123@gmail.com'");
//		js.executeScript("document.getElementById('submit').click()");
		//File Uploded and robots class 
		Thread.sleep(3000);
		driver.get("https://demoqa.com/upload-download");
//		driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\ROYAL INFOTECH\\OneDrive\\Desktop\\CV formet");
	    driver.findElement(By.xpath("//a[text()='Download']")).click();
		
		
		



	}

}

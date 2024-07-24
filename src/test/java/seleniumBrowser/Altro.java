package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Altro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://testfire.net/login.jsp");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
//		driver.findElement(By.name("jsmith"));
//		driver.findElement(By.id("demo1234"));
		//driver.getCurrentUrl();
		Thread.sleep(2000);
		//WebElement uname =driver.findElements(By.name("uid"));
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
//		Thread.sleep(2000);
//		driver.findElement(By.name("passw")).sendKeys("demo1234");
//		driver.findElement(By.name("btnSubmit")).click();
//		driver.close();
		//driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		driver.findElement(By.xpath("//input[contains(@id,'uid')]")).sendKeys("jsmith");
		
		//driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
		// absaulet x-path useing 
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");
		//driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		// Relative x-path useing in button 
		//driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		// useing xpath OR,AND -expreassion are  used-
		driver.findElement(By.xpath("//input[@name='btnSubmit' and @value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Transfer Funds")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Recent")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("img")).click();
		driver.navigate().back();
		//driver.close();


	}

}

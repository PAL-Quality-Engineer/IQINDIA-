package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		WebElement ap=driver.findElement(By.xpath("//a[@class='_1ch8e_'][3]"));
		WebElement tr=driver.findElement(By.xpath("//a[@class='_1ch8e_'][4]"));
		
		act.moveToElement(ap).perform();
		act.moveToElement(tr).perform(); 	
		
		

	}

}

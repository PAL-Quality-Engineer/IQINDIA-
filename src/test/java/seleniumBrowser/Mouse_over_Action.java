package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_over_Action {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/account/login?ret=/");

		WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		WebElement we1 = driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"));
		WebElement we2 = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));

		Actions act = new Actions(driver);
		act.moveToElement(we).perform();// move to webelement.
		Thread.sleep(1000);
		act.moveToElement(we1).perform();// move to webelement
		Thread.sleep(1000);
		act.moveToElement(we2).perform();// move to webelement.
        
	}

}

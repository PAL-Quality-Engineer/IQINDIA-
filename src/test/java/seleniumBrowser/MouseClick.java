package seleniumBrowser;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		
//		Actions act =new Actions(driver);
//		act.contextClick(button).build().perform();// used for right click 

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act = new Actions(driver);
		act.doubleClick(button).build().perform();//double click perform 
		Alert al=driver.switchTo().alert();// alret accepts swith to alret 
		al.accept();

	}

}

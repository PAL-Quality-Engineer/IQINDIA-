package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_DownHYRMulti2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//select[@id='ide']"));
		Select sl =new Select(we);
		sl.selectByIndex(0);
		sl.selectByIndex(1);
		Thread.sleep(2000);
		sl.selectByIndex(2);
		Thread.sleep(2000);
		sl.selectByIndex(3);
		Thread.sleep(2000);
		sl.deselectAll();
			
		
		
		
	}
}

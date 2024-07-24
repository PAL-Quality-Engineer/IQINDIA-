package seleniumBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Handle_HYR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String PWindow =driver.getWindowHandle();
		System.out.print(PWindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page");
		Thread.sleep(1000);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		Set<String> ChildWindos =driver.getWindowHandles();
		for(String str:ChildWindos) {
			if(!str.equals(PWindow)) {
				
			WebDriver we=driver.switchTo().window(str);
			String url=we.getCurrentUrl();
			String tittle=driver.getTitle();
			// yaha apna kuch bhi kam kar saktey child page ka 
			System.out.print(url);
			System.out.print(tittle);
			driver.close();
				
				
			}
		
			
			
		}
		driver.switchTo().window(PWindow);
		driver.findElement(By.xpath("//button[@class='whButtons']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page afte the child page ");
		driver.close();
	

	}
}

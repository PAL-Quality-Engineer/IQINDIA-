package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_DownHYR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement we=driver.findElement(By.xpath("//select[@id='course']"));
		Select sl =new Select(we);
		
		
		// selector drop drop down key ley three method hi
	
//		sl.selectByIndex(0);
//		Thread.sleep(2000);
//		sl.selectByIndex(1);
//		sl.selectByIndex(2);
//		sl.selectByIndex(3);
		
//		sl.selectByValue("select");
//		sl.selectByValue("java");
//		sl.selectByValue("net");
//		sl.selectByValue("python");
//		sl.selectByValue("js");
//		
		
	   sl.selectByVisibleText("Select");
	   sl.selectByVisibleText("Java");
		
		
			
		
		
		
	}
}

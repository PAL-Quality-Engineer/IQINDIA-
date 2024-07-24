package seleniumBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindow_And_TapHandle_HYR3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		// Thread.sleep(2000);
		// Thread.sleep(2000);
		String PWindow = driver.getWindowHandle();
		System.out.print(PWindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page");
		Thread.sleep(1000);
		WebElement vv = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		vv.click();
		Thread.sleep(1000);
		Set<String> ChildWindos = driver.getWindowHandles();
		for (String str : ChildWindos) {
			if (!str.equals(PWindow)) {
				WebDriver we = driver.switchTo().window(str);
				String url = we.getCurrentUrl();
				String tittle = driver.getTitle();
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

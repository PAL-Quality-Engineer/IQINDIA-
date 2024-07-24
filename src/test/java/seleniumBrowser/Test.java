package seleniumBrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String pwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).sendKeys("This is parent window");
		System.out.println(pwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'This button is ')]/following-sibling::button")).click();
		Set<String> cwindow=driver.getWindowHandles();
		Thread.sleep(1000);
		for(String str: cwindow) {
			if(!str.equals(pwindow)) {
				driver.switchTo().window(str);
				String title=driver.getTitle();
				System.out.println(title);
				driver.close();				
			}
		}
		driver.switchTo().window(pwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).clear();
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).sendKeys("This is update");

	}

}

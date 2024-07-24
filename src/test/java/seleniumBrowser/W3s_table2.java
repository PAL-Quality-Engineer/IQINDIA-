package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3s_table2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.xpath("//td[text()='Canada']/preceding-sibling::td[2]"));
		String str=we.getText();
		System.out.print(str);
		

	}
}

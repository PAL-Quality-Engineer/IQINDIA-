package seleniumBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_PopUP_HYR {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// useing alert popup
		driver.findElement(By.xpath("//button[text()='Click me']")).click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.accept();
		WebElement we=driver.findElement(By.xpath("//div[@id='output']"));
		String str=we.getText();
		System.out.print(str);

		// useing ok and cancel alert popup
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Thread.sleep(2000);
		Alert al1=driver.switchTo().alert();
		//al1.accept();
		al1.dismiss();
		WebElement we1=driver.findElement(By.xpath("//div[@id='output']"));
		String str1=we1.getText();
		System.out.print(str1);

		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(2000);
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(2000);
		al2.sendKeys("Test Demo");
		al2.accept();
		// al2.dismiss();
		WebElement we2 = driver.findElement(By.xpath("//div[@id='output']"));
		String str2 = we2.getText();
		System.out.print(str2);

	}
}

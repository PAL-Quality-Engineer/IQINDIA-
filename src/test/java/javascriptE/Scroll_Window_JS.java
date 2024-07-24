package javascriptE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Window_JS {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		// js.executeScript("window.scroll(0,5000)");

		// use scrollTo window scroll

		// js.executeScript("window.scrollTo(0,4000)");
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']")).click();
		// use to scrollInToview

		WebElement BTP = driver.findElement(By.xpath("//i[@class='fa fa-hand-o-up']"));
		js.executeScript("arguments[0].scrollIntoView(true);", BTP);
		BTP.click();

	}

}

package Learn_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asrology_Login {

	static WebDriver driver;

	@BeforeTest

	public void AstrologyDemo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void Astrology_Login() throws InterruptedException {
		driver.get("https://www.astroyogi.com/kundli");
		Thread.sleep(2000);
		driver.findElement(By.id("Kund_Name")).sendKeys("vidul pal");
		WebElement we = driver.findElement(By.id("UserGender"));
		// Locate of Date of Birth
		WebElement we1 = driver.findElement(By.id("Date"));
		WebElement month = driver.findElement(By.id("Month"));
		WebElement year = driver.findElement(By.id("Year"));
		Select sc = new Select(we);
		sc.selectByValue("Male");
		Select dt = new Select(we1);
		dt.selectByValue("21");
		Select mt = new Select(month);
		mt.selectByValue("6");
		Select yt = new Select(year);
		yt.selectByValue("1993");
		// Locate of Birth Date time

		WebElement BirthTime = driver.findElement(By.id("Kund_F_BirthPlace_Hour"));
		WebElement minute = driver.findElement(By.id("Kund_F_BirthPlace_Minute"));
		WebElement DN = driver.findElement(By.id("Kund_F_BirthPlace_AM"));
		Select hr = new Select(BirthTime);
		hr.selectByVisibleText("4");
		Select min = new Select(minute);
		min.selectByVisibleText("00");
		Select DayNight = new Select(DN);
		DayNight.selectByVisibleText("PM");
		WebElement palce = driver.findElement(By.xpath("//input[@id='Kund_BirthPlace']"));
		
//		WebElement mee = driver.findElement(By.xpath("//li[@class='ui-menu-item']/child::div[text()='Meerut, Uttar Pradesh, IN']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(mee).build().perform();
		
		List<WebElement> place=driver.findElements(By.id("Kund_BirthPlace"));
		for(WebElement st:place) {
		
			
		}
		driver.findElement(By.xpath("//button[@id='kundli_submit']")).click();

	}

	public void tear_Down() {
		driver.close();

	}

}

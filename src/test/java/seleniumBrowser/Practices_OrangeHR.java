package seleniumBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practices_OrangeHR {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("vidul pal");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("palvidul51@gmail.com");
		driver.findElement(By.id("Form_getForm_CompanyName")).sendKeys("Orbex Techonologyies pvt.ltd");
		// multi  drop down option we can used in this getoptction().......................//
		WebElement Multicontry = driver.findElement(By.id("Form_getForm_Country"));
		Select drp = new Select(Multicontry);
		List<WebElement> MoreCountry = drp.getOptions();
		
		for (WebElement opection:MoreCountry) {
			if (opection.getText().equals("India")) {
				
				opection.click();
				break;
			}
			
		}
		
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("09557067132");
		// captecha is not support in Selenium 
        //driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
        driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']")).click();
	}

}

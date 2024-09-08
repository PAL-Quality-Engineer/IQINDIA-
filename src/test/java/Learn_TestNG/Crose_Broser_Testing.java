package Learn_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crose_Broser_Testing {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();	
		}
		
		else if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();	
		}
		
		else if(browser.equalsIgnoreCase("Safari")) {
			driver=new SafariDriver();	
		}
		else {
			
			throw new Exception("Incorrect browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	
	public void verifyTitle() {
		
		driver.get("https://www.browserstack.com/");
	    String title=driver.getTitle();
		System.out.println("Title is:"+ title);
		Assert.assertEquals(title, "Most reaible app ||Browser stack ");
	}

}

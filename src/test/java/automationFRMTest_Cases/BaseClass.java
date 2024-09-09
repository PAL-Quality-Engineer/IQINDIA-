package automationFRMTest_Cases;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import automationFRM_Utilities.Config_Read_File;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	Config_Read_File rc=new Config_Read_File();
	 
	 String url=rc.getBaseURL();
	 String browser=rc.getBrowser();
	 
	 public static WebDriver driver;
	 public static Logger logger;
	 
	 
	 @BeforeClass
	 public void setup() {
		 
		
		 switch(browser.toLowerCase()) {
		 
		 case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 break;
			 
		 case "msedge":
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 break;
			 
		 case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 break;
			 
			default:
				System.out.println("Browser not found :");
				break;
		 
		 
		 }
		 // implicity wait of 10 secs;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	
		 
		
	 }
	 @AfterClass
	 public void tearDown() {
		 
		 driver.close();
		 driver.quit();
	 }
	 

}

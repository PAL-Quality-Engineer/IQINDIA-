package PropertiesFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_File_Test {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         //Create the object of config read file 
         
         Config_file_ReadPropertiesFlie_Test cfm=new Config_file_ReadPropertiesFlie_Test();
        
         
         driver.get(cfm.geturl());
         Thread.sleep(2000);
         driver.findElement(By.name("username")).sendKeys(cfm.username());
         driver.findElement(By.name("password")).sendKeys(cfm.password());
         driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

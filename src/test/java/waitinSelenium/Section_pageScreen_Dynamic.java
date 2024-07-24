  package waitinSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section_pageScreen_Dynamic {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Used for section of a web page screnshot
		// Do not use TakesScreenshot ts =((TakesScreenshot)driver);
		TakesScreenshot ts=((TakesScreenshot)driver);
		LocalDateTime ltd=LocalDateTime.now();
		DateTimeFormatter ftr=DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		String src=ltd.format(ftr);
		driver.get("https://www.flipkart.com/");
		WebElement section = driver.findElement(By.xpath("//div[@class='_2SmNnR']"));
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\"+src+".png";
		File dest = new File(path);
		try {
			FileUtils.copyFile(Source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

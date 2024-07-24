package waitinSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Section_PAgeScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// Used for section of a web page screnshot
		// Do not use TakesScreenshot ts =((TakesScreenshot)driver);
		driver.get("https://www.flipkart.com/");
		WebElement section = driver.findElement(By.xpath("//div[@class='_2SmNnR']"));
		File Source = section.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\image Section1.png";
		File dest = new File(path);
		FileUtils.copyFile(Source, dest);

	}

}

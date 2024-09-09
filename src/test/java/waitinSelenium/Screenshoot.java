package waitinSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshoot {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = ((TakesScreenshot) driver);
		driver.get("https://www.flipkart.com/");
		File ScreenFile = ts.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\image.png9";
		File targetfile = new File(path);
		try {
			FileUtils.copyFile(ScreenFile, targetfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

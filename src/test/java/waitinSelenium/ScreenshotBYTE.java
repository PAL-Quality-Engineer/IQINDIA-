package waitinSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotBYTE {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		LocalDateTime ltd=LocalDateTime.now();
		DateTimeFormatter myformate=DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		String str=ltd.format(myformate);
		//System.out.println(str);
		driver.get("https://www.amazon.in/");
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\"+str+".png";
		File targetfile = new File(path);
       byte[] bytarr=ts.getScreenshotAs(OutputType.BYTES);
      
	try {
		FileUtils.writeByteArrayToFile(targetfile, bytarr);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}

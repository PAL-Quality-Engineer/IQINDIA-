package waitinSelenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotBAS64 {

	public static void main(String[] args) throws FileNotFoundException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.get("https://www.flipkart.com/");
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\image.png8";
		File targetfile = new File(path);
		//FileOutputStream fos =new FileOutputStream(path);
       String srcshot= ts.getScreenshotAs(OutputType.BASE64);
       byte[] targetfile1=Base64.getDecoder().decode(srcshot);
      
       
	try {
		FileUtils.writeByteArrayToFile(targetfile, targetfile1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

package Listener;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ITestListenersClass.class)

public class TestClass {
	private static final String[] Test3 = null;
	@Test(priority=1)

	public void Test1() {

		System.out.println("Inside the test1");
	}
	@Test(priority=2)

	public void Test2() {

		System.out.println("Inside the test2");
		Assert.assertTrue(false);

	}
	@Test(timeOut=100,priority=3)
	
	public void Test3() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Inside the test3");
		
		
	}
	@Test(priority=4,dependsOnMethods="Test3")
	public void Test4() {
		System.out.println("Inside the Test4 ");
		
		
	}
	@Test
	public void Screenshot() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		LocalDateTime ltd=LocalDateTime.now();
		DateTimeFormatter myformate=DateTimeFormatter.ofPattern("ddMMyyyyhhmmss");
		String str=ltd.format(myformate);
		//System.out.println(str);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String path1 = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\screenshot\\"+str+"vidul.html";
		//File targetfile = new File(path);
		FileOutputStream fos =new FileOutputStream(path1);
       byte[] bytarr=ts.getScreenshotAs(OutputType.BYTES);
       fos.write(bytarr);
       
       
       
	}
}

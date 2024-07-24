package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRY_Hyprtutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Vidul");
		driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("Pal");
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("Test@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input[1]")).sendKeys("Demo@123");
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input")).sendKeys("Demo@123");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'Reset')]")).click();
		driver.findElement(By.xpath("//div[@class='container']/descendant::button[3]")).click();
		WebElement we = driver.findElement(By.xpath("//button[text()='Reset']"));
		String str = we.getText();
		System.out.print(str);
		// useing Clear button
//	    driver.findElement(By.xpath("//button[text()='Clear']")).click();
//	   	Thread.sleep(2000);
//	    WebElement we1= driver.findElement(By.xpath("//button[text()='Clear']"));
//	    String str1=we1.getText();
//	    System.out.print(str1);
//	    
////	    //useing Refreash button 
//		driver.findElement(By.xpath("//input[@name='refreshbtn']")).click();
//		Thread.sleep(2000);
//		WebElement refresh = driver.findElement(By.xpath("//input[@name='refreshbtn']"));
//		String str2 = refresh.getText();
//		System.out.print(str2);
		// useing Regirstred
		// driver.findElement(By.xpath("//button[text()='Register']")).click();
//		driver.findElement(By.xpath("//div[@class='container']/descendant::button[1]")).click();
//		Thread.sleep(2000);
//		WebElement refresh1 = driver.findElement(By.xpath("//button[text()='Register']"));
//		String str3 = refresh1.getText();
//		System.out.print(str3);
//
//		// useing country name corspoonding check box click
//
		Thread.sleep(2000);

		driver.findElement(By.xpath("//td[text()='Mexico']/preceding-sibling::td[2]/child::input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='Mexico']/following-sibling::td[2]/a")).click();

//		driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/a")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"nav1\"]/li[4]/ul/li[3]/a")).click();
		// int sum =0;
		// List<WebElement> we =driver.findElements(By.xpath("//td[text()>='5000']"));

// 	      for (WebElement vvv :we) {
// 	      String itr=vvv.getText();
//	     int value = Integer.parseInt(itr);
//	   // System.out.println("Sum"+" "+value );
//	    sum=value+sum;
//	    System.out.println("Sum"+" "+sum );
//	    
//	   
//	    	}

	}
}

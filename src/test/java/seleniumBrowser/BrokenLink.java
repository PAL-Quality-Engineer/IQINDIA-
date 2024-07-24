package seleniumBrowser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.deadlinkcity.com/");
		Thread.sleep(1000);
		List<WebElement> lst=driver.findElements(By.tagName("a"));
				
		int rescode =200;// 200 response code is valid but after the 200 response code showing the error not valid link
		int Brokenlistcont=0;
		System.out.println("Total linke size count"+lst.size() );
		
		for (WebElement we:lst) {
			
			String url=we.getAttribute("href");
			
			try {
				
				
			 	URL urllinked =new URL(url);
			 	
			 	 HttpURLConnection huc=(HttpURLConnection)urllinked.openConnection();
			 	 huc.setRequestMethod("HEAD");
			 	 huc.connect();
			 	 
			 	 if (rescode >=400) {
			 		 System.out.print(url+"Broken List");
			 		Brokenlistcont++;
			 		 
			 		 
			 	 }
				
			} catch (MalformedURLException  e) {
				
			}
			catch(Exception e){
				
				
			}
			
		}
		
		System.out.println("Total broken Linked :"+Brokenlistcont);
		

	}

}

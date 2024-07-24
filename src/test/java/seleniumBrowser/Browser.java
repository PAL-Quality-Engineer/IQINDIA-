package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.className("Pke_EE")).sendKeys("mobile5g",Keys.ENTER);
//     	String currhandler=driver.getWindowHandle();
//     	driver.switchTo().window(currhandler);
//     	driver.findElement(By.partialLinkText("Ocean Green, 128 GB")).click();
//     	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		driver.get("https://www.gtccabs.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkTex t("Sign Up")).click();
		driver.findElement(By.id("UserTyp  e")).click();
	    WebElement dropdown =driver.findElement(By.id("UserType"));
	    Select select =new Select(dropdown);
	    select.selectByValue("0");
	    Thread.sleep(1000);
	    select.selectByVisibleText("I'm a Passenger");
	    Thread.sleep(2000);
	    select.selectByIndex(1);
//	    select.selectByVisibleText("I'm a Driver");
//	    Thread.sleep(2000);
//	    select.selectByIndex(2);
	    
	    
		
		
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Vidul");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("Pal");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("vidulpal06@gmail.com");
		driver.findElement(By.cssSelector("input#Mobile")).sendKeys("9557067139");
	    driver.findElement(By.cssSelector("input#RefferalBy")).sendKeys("vid#$@123");
	    
	    WebElement datepicker =driver.findElement(By.id("DateOfBirth"));
	    datepicker.click();
	    
//	    String month ="March";
//	    String year  ="2024";
//	    String day  ="23";
//	    
//	    
//	    while(true) {
//             String datemonth  =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();	   
//             String dateYear   =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//         if (datemonth.equals(month)&& dateYear.equals(year)) {
//        	 
//        	 List <WebElement> days = driver.findElement(By.xpath("//table//tr//td[contains(.,"+day+")]"));
//         }
//	    	
//    	break;
//	    	
//	    	
//	    }
//	    else if (text.equals(backdate)) {
//	    	// click the prevouse  button 
//	    	//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
//	    	
//	    	// click the next button 
//	    	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
//	    	
//	    	
//	    }
//	    else {
//	    	// click the next  button 
//	    	//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
//	    	//click prevouse button 
//	    	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
//	    }
//	    
//  	   
//	 
//	   	    }
	    
	   
	    
//	    
//	    while (true) {
//            // Get the currently displayed month and year
//            String displayedMonthYear = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
//
//            // Compare the displayed month/year with the target month/year
//            if (displayedMonthYear.equals(targetMonthYear)) {
//                break;
//            }
//
//             //Determine whether to go forward or backward
//            if (isBefore(displayedMonthYear, targetMonthYear)) {
//                // Click the next button
//                driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
//            	  // Click the previous button
//                //driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
//            }
//            
//            
//            else {
//                // Click the previous button
//                driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
//                
//                // Click the next button
//              //driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
//                
//            }
//        }
	    
	    
	   // driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[1]/tbody[1]/tr/td[contains(.,"+day+")]")).click();
	   
	   	//driver.findElement(By.cssSelector("input#DateOfBirth")).sendKeys("21-06-1993");
	    driver.findElement(By.cssSelector("input#Male")).click();
	   	driver.findElement(By.cssSelector("input#Password")).sendKeys("June@2024");
	    driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("June@2024");
	    driver.findElement(By.cssSelector("input#book_terms")).click();
	    driver.findElement(By.className("signup-btn")).click();
	    
	
		
		

	}

	

}

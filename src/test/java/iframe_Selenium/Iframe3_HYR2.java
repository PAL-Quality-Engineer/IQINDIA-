package iframe_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe3_HYR2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(1000);
		WebElement we1=driver.findElement(By.xpath("//i[@class='fa fa-home']"));
		WebElement we=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(we).build().perform();
		Thread.sleep(1000);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("This is a Iframe home -page ");
		Thread.sleep(2000);
 		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.print("Number of iFrame size  :"+size);
		Thread.sleep(2000);
		WebElement frm=driver.findElement(By.id("frm3"));
		driver.switchTo().frame("frm");
		Thread.sleep(1000);
		WebElement vv=driver.findElement(By.id("selectnav1"));
		Select sl =new Select(vv);
		sl.selectByIndex(3);
		Thread.sleep(2000);
		WebElement frm3=driver.findElement(By.id("name"));
		frm3.sendKeys("In this fram 3 home page ");
		Thread.sleep(2000);
		WebElement frm1 =driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frm1);
		Thread.sleep(2000);
		WebElement frmselect=driver.findElement(By.id("selectnav1"));
		Select sl2 =new Select(frmselect);
		sl2.selectByIndex(5);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("In this fram 3 home page after fram1 ");
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("It is a home page after child iframe3");
		driver.quit();
		
		
		
	
		

	}

}

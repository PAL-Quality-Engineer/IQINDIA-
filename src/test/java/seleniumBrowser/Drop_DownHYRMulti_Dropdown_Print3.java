package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_DownHYRMulti_Dropdown_Print3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement we =driver.findElement(By.xpath("//select[@id='course']"));
		Select sl=new Select(we);
		List<WebElement> lst=sl.getOptions();
		int lst1=lst.size();
		System.out.println(lst1);
		
		for (WebElement str:lst) {
			String vv=str.getText();
			System.out.println(vv);
			sl.selectByVisibleText(vv);
			Thread.sleep(2000);
			
			
		}
	
			
		
		
		
	}
}

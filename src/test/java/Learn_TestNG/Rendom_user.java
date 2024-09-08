package Learn_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rendom_user {

	public static WebDriver driver;

	@BeforeTest
	public void Init(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

	}

	@Test(invocationCount = 5,timeOut=10000)
	public void Countinvocation() {

		driver.get("https://randomuser.me/");
		WebElement we=driver.findElement(By.xpath("//p[@id='user_title']"));
		WebElement we1 = driver.findElement(By.xpath("//p[@id='user_value']"));
		String src =we.getText();
		//Thread.sleep(2000);
		String Src1=we1.getText();
		System.out.println(src+":"+" "+Src1);
		driver.navigate().refresh();
		
	


	}

	@AfterTest

	public void closed() throws InterruptedException {

		Thread.sleep(2000);

		driver.close();
	}

}

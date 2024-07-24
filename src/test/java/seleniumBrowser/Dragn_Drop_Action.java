package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragn_Drop_Action {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.id("box6"));//room
		WebElement target=driver.findElement(By.id("box106"));//Itely
		WebElement seoul=driver.findElement(By.id("box106"));//Itely
		WebElement target2=driver.findElement(By.id("box107"));//Itely
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		act.dragAndDrop(seoul, target2).build().perform();//dargen and drop perform useing sourse code and target code
		act.dragAndDropBy(source, 500, 500).build().perform();

	

	}

}

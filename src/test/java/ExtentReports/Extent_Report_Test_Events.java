package ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Report_Test_Events {

	@Test

	public void ExtentReport() throws IOException, InterruptedException {

		ExtentReports extentreport = new ExtentReports();
		String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\ExtentReport\\Report4.html";
		ExtentSparkReporter sparkrepoter = new ExtentSparkReporter(path);

		extentreport.attachReporter(sparkrepoter);
		extentreport.createTest("Test").log(Status.INFO, "<b><i>Test case is pass</b><i>")
				.log(Status.PASS, "<b>This test case is pass</b>").log(Status.SKIP, "This test case is skip")
				.log(Status.WARNING, "This test case is create warring ").log(Status.FAIL, "This test case is fail");

		ExtentTest test2 = extentreport.createTest("Test2");
		test2.assignAuthor("Mr.Vivek kumar");
		sparkrepoter.config().setTheme(Theme.DARK);
		sparkrepoter.config().setDocumentTitle("MyReport");
		String JSONData = "{'name':'QA','Addersse':'NewDelhi','mo':'12345'}";
		test2.info(MarkupHelper.createCodeBlock(JSONData, CodeLanguage.JSON));

		try {

			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {
			extentreport.createTest("Costum Exception").info(e);

		}

		extentreport.flush();

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

		extentreport.createTest("Screenshot")
		.info("This is a screenshot ")
		.addScreenCaptureFromPath(path,
				"This is screenshot of amazone page new  ");
		driver.quit();

		extentreport.flush();
		//Desktop.getDesktop().browse(new File(path).toURI());

	}
}

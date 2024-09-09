package ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Report_Test {



@Test

public void ExtentReport() throws IOException {
	
	ExtentReports extentreport=new ExtentReports();
	String path ="C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\ExtentReport\\Report1.html";
	ExtentSparkReporter sparkrepoter=new ExtentSparkReporter(path);
	
	extentreport.attachReporter(sparkrepoter);
	ExtentTest test1=extentreport.createTest("Test1");
	test1.pass("This test is pass");
	test1.fail("This test is fail");
	ExtentTest test2=extentreport.createTest("Test2");
	test2.pass("This test is pass");
	test2.fail("This test is fail");
	//test2.assignAuthor("Mr.Sintu kumar");
	test2.pass("This test case is pass ");
	sparkrepoter.config().setTheme(Theme.DARK);
	sparkrepoter.config().setDocumentTitle("MyPersnol Report"); 
	 
	extentreport.flush();
	extentreport.flush();
	//Desktop.getDesktop().browse(new File(path).toURI());
	
}
}

package Learn_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test {
  @Test
  public void Test() {
	  System.out.println("Inside the Before Test case ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Inside the Bedoremethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("Inside the after method ");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Inside the Bedore class  ");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Inside the after class  ");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Inside the Bedore test");
  }
  

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("Inside the Bedoremethod ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Inside the Beforesuite ");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("Inside the aftersuite ");
  }

}

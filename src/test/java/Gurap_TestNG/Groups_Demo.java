package Gurap_TestNG;

import org.testng.annotations.Test;

public class Groups_Demo {

	@Test(groups= {"smoke"})
	public void TC01() {

		System.out.println("Inside the TC01");
		
	}
    
	@Test(groups= {"smoke","sanity"},dependsOnMethods="TC01",enabled=true)

	public void TC02() {

		System.out.println("Inside the TC02");
	}

	@Test(groups= {"sanity","Regrassion"},dependsOnMethods="TC02")
	public void TC03() {

		System.out.println("Inside the TC03");
	}

	@Test(groups= {"BloackboxTesting"},dependsOnMethods="TC03")
	public void TC04() {

		System.out.println("Inside the TC04");
	}

	@Test(groups= "whitebox")

	public void TC05() {

		System.out.println("Inside the TC05");
	}

}

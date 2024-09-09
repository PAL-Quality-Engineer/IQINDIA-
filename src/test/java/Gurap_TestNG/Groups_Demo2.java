package Gurap_TestNG;

import org.testng.annotations.Test;

public class Groups_Demo2 {

	@Test(groups= {"smoke"})
	public void TC06() {

		System.out.println("Inside the TC06");
		
	}
    
	@Test(groups= {"smoke","sanity"})

	public void TC07() {

		System.out.println("Inside the TC07");
	}

	@Test(groups= {"whitebox"})
	public void TC08() {

		System.out.println("Inside the TC08");
	}

	@Test(groups= {"BloackboxTesting"})
	public void TC09() {

		System.out.println("Inside the TC09");
	}

	@Test(groups= "whitebox")

	public void TC010() {

		System.out.println("Inside the TC010");
	}

}

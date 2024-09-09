package Gurap_TestNG;

import org.testng.annotations.Test;

public class Groups_Demo3 {

	@Test(groups= {"Dailywork"})
	public void TC011() {

		System.out.println("Inside the TC011");
		
	}
    
	@Test(groups= {"smoke","uattesting"})

	public void TC012() {

		System.out.println("Inside the TC012");
	}

	@Test(groups= {"Regrassion"})
	public void TC013() {

		System.out.println("Inside the TC013");
	}

	@Test(groups= {"Fuctiontesting"})
	public void TC014() {

		System.out.println("Inside the TC014");
	}

	@Test(groups= "whitebox")

	public void TC015() {

		System.out.println("Inside the TC015");
	}

}

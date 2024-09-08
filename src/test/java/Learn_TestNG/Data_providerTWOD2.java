package Learn_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providerTWOD2 {

	@DataProvider(name = "test")
	
	public Object[][]DataSource() {
		
		Object [][]arr=new Object[][] {
			{"jsmith","demo1234"},{"jsmith","demo"},{"jism","demo321"}};
	
		return arr;	
	}

}

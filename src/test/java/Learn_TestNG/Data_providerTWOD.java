package Learn_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_providerTWOD {
	
	@Test(dataProvider = "test")
	public void test(Object arr,Object arr2) {
		System.out.println(arr);
		System.out.print("_");
		System.out.print(arr2);
		System.out.println();
		
		
		
	} 
	
	@DataProvider(name = "test")
	
	public Object[][]DataSource() {
		
		Object [][]arr=new Object[][] {
			{"Test","QA"},{"Manager",123}
		};
		return arr;	
	}

}

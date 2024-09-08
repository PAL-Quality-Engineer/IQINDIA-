package Learn_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	
	@Test(dataProvider = "test")
	public void test(Object arr) {
		System.out.println(arr);
		
		
		
	} 
	
	@DataProvider(name = "test")
	
	public Object[] DataSource() {
		
		Object []arr=new Object[]{"Test","QA","Manager",123,234.45,'c'};
		return arr;	
	}

}

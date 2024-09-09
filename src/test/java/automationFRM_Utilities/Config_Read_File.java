package automationFRM_Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config_Read_File {
	
	Properties pr;
	String path ="C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\Configuraction_AutoFRMK\\Config.propeties";
	
	public Config_Read_File() {
		try {
			
		pr=new Properties();
		
			FileInputStream fis=new FileInputStream(path);
			
			pr.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 public String getBaseURL() {
	String value= pr.getProperty("BaseURL");
	 
	 if(value!=null) {
		 return value ;
		 
	 }
		
	 else {
		 
		 throw new RuntimeException("URL not found");
	 }
 }
	 
	 public String getBrowser() {
			String value= pr.getProperty("Browser");
			 
			 if(value!=null) {
				 return value ;
				 
			 }
				
			 else {
				 
				 throw new RuntimeException("Browser not found");
			 }
		 
	 
 }
}


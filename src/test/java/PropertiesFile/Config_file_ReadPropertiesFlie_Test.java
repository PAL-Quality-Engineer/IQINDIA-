package PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_file_ReadPropertiesFlie_Test {

	Properties pr;

	String path = "C:\\Users\\ROYAL INFOTECH\\eclipse-workspace\\GTC002\\src\\test\\java\\PropertiesFile\\configText.txt";

	public Config_file_ReadPropertiesFlie_Test(){
		pr = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				pr.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		

	}
	public String geturl() {
		String url=pr.getProperty("url");
			
		if (url!=null) {
			return url;		
		}
		else{
			
			throw new RuntimeException("Url is not found null ");
		}
	}
	
	public String username() {
	String uname=pr.getProperty("Username");
	
	if(uname!=null) {
		return uname;
		
	}else {
		throw  new RuntimeException("username is not found null ");
	}
		
		
	}
	public String password() {
		
		String pass=pr.getProperty("Password");
		if(pass!=null){
			return pass;
			
		}else {
			throw new RuntimeException("password is not found null");
		}
	}
	
	

}

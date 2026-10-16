package PracticePropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PractProperties {

	public static void main(String[] args) throws IOException
	{
		// location of the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		// create object for Properties class and load the file
		Properties prop = new Properties();
		prop.load(file);
		
		// reading properties
		String url =prop.getProperty("url");
		String usn = prop.getProperty("Username");
		String pwd = prop.getProperty("Password");
		
		System.out.println(url+"   "+usn+"   "+pwd);
		
		Collection<Object>  properties = prop.values();
		System.out.println(properties);
		
		
		
		// reading keys
		Set<String> propName =  prop.stringPropertyNames();
		System.out.println(propName);
		
		Set<Object> keys = prop.keySet();
		System.out.println(keys);
		
	}
	
}

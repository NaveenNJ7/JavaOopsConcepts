package Propertydata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\data.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		// reading data
		String url = property.getProperty("appurl");
		String email = property.getProperty("email");
		String password = property.getProperty("password");
		String id = property.getProperty("orderid");
		String csid = property.getProperty("customerid");
		
		System.out.println(url+", "+email+", "+password+", "+id+", "+csid);
		
		// reading key value name
		Set<String> keys = property.stringPropertyNames();
		System.out.println(keys);
		
		//reading key value name
		Set<Object> key = property.keySet();
		System.out.println(key);
		
		Collection<Object> values = property.values();
		System.out.println(values);
		
		file.close();
		
	}
}

package Propertydata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\mydata.properties");
		
		Properties property = new Properties();
		
		property.load(file);
		
		String url = property.getProperty("appurl");
		String name = property.getProperty("Name");
		String number = property.getProperty("Number");
		String mail = property.getProperty("email");
		String message = property.getProperty("Message");
		
		System.out.println(url+", "+name+", "+number+", "+mail+", "+message);
		
		Collection<Object> values = property.values();
		System.out.println(values);
		
		Set<Object> keys = property.keySet();
		System.out.println(keys);
		
		Set<String> key = property.stringPropertyNames();
		System.out.println(key);
	}
}

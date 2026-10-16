package Day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class practiceProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Dummy.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		// reading properties
		String url = prop.getProperty("url");
		String pwd = prop.getProperty("password");
		String usn = prop.getProperty("username");
		
		System.out.println(pwd+"  "+usn+"  "+url);
		
		Collection<Object> properties = prop.values();
		System.out.println(properties);
		
		//reading keys
		Set<Object> keys = prop.keySet();
		System.out.println(keys);
		
		Set<String> names = prop.stringPropertyNames();
		System.out.println(names);
	}
}

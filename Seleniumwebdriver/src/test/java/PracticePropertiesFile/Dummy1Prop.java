package PracticePropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dummy1Prop {

	public static void main(String[] args) throws IOException {
		
		//Location of the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Dummy1.properties");
	    
		Properties prop = new Properties();
		prop.load(file);
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("pwd");
		
		
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
		Collection<Object> propet =  prop.values();
		System.out.println(propet);
		
	    Set<Object> keyvalues =  prop.keySet();
	    System.out.println(keyvalues);
	    
	    Set<String> proprtynames = prop.stringPropertyNames();
	    System.out.println(proprtynames);
	}
	
}

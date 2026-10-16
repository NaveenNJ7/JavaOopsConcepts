package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// all links have same tag name
		List<WebElement> Alllinks =driver.findElements(By.tagName("a"));
		
		int brokenlinks = 0;
		for(WebElement links: Alllinks)
		{
			// getAttribute will get value of the href(link)
			String link = links.getAttribute("href");
			
			if(link==null || link.isEmpty())
			{
				System.out.println("Link is empty or null, so does not possible to check");
				continue;
				//if link is empty than continue will skip that and it will take next link and continue looping
				/*
				  The key continue is not there- what will happen
				  ----> 1) Assume condition will match and compiler will come inside if condition and statement will
				   print, and next for same link, below codes also execute. 
				   but link is empty or does not have any link so there is no need to check below conditions,
				   
				  
				  2) so if we put key continue in condition, assume condition will match and
				     compiler will come inside. it will print
				     statement and the key continue will skip that link, so that below codes outside the if condition 
				     will not execute for that(empty link). it means next another link will come inside the for loop.
			         */
				 
				 
			}
			
			try {
			/*
			1)first href link we store in list are in string format, so convet them to URL format
			so create object for URL class and pass link(value of href)
			it will throw exception so that we put try and catch block
		    */
			URL Hlink = new URL(link);
			
			/* open connection to server, it will return something so store in a variable and datatype is
			HttpURConncetion (and also try URLConnection)*/
			HttpURLConnection con = (HttpURLConnection) Hlink.openConnection();
			
			// connect to the server
			con.connect();
			
			if(con.getResponseCode()>=400)
			{  
				// if response code is greater than or equal to 400 then it is broken
				System.out.println(Hlink+" is broken");
				
				//before for loop declare and initialize 
				brokenlinks++;
			}
			else
			{
				// if response code is lesser than 400 then it is not a broken link
				System.out.println(Hlink+" is not broken");
			}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Number of broken links :"+brokenlinks);
		
		
		
	}
}

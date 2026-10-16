package Navigationalmethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 using navigate().to it accepts url in String format and URL object format, 
		 2 approaches are there sending directly url in string format
		 and create object for URL class and pass url in constructor
		 */
    //  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.navigate().to(myurl);
        
        driver.manage().window().maximize();
        
        URL url = new URL("https://demo.nopcommerce.com/register");
        
        driver.navigate().to(url);
        
        driver.manage().window().maximize();
        
        driver.navigate().back();
        
       // driver.navigate().refresh();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
        
                 
        
		
	}
}

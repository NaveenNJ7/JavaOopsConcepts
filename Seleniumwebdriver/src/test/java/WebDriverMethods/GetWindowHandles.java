package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		URL url = new URL("https://testautomationpractice.blogspot.com/");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='HTML4']//button")).click();
		
	    Set<String> Windowids = driver.getWindowHandles();
	    
	    // convert it to array list because, set collection does not have get()
	    
	    List<String> ids = new ArrayList<String>(Windowids);
	    String id1 =ids.get(0);
	    String id2 =ids.get(1);
	    
	    System.out.println("Main page title :"+driver.getTitle());
	    
	    driver.switchTo().window(id2);
	    Thread.sleep(2000);
	    System.out.println("2nd page title :"+driver.getTitle());
	    
	    driver.switchTo().window(id1);
	    Thread.sleep(2000);
	    System.out.println("url of main page :"+driver.getCurrentUrl());
	    
	    driver.quit();
	    
	}
}

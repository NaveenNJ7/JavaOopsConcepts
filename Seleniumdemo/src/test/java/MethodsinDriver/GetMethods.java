package MethodsinDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// get() 
	    // access these methods from web driver
		// these methods will not work on web elements, they will work on web pages
		// page level not element level
		// used only when launched the browser
		// getText() will not comes under get(), only apply on the web  element
		WebDriver driver = new ChromeDriver();
		
		// 1)get() - used to open the url of the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// 2)getTitle() - returns the title of the page -return - String
		String title = driver.getTitle();
		System.out.println(title);
		
		// 3)getCurrentUrl() - returns the url of the page, that browser is looking - return - String
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// 4)getWindowHandle() - returns the id of the page or single browser window - return -String
		//id of the page is dynamic it will change every time we open the page
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// 5)getWindowHandles() - returns id's of multiple browser window-return String of Set collection
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		/*
		 6)getPageSource() - returns the source code of the page, which is not in understandable format.
		 most of the time we will not use this.
		 */
		/*
		 close() this is close the single browser window
		 quit() this close the all the browser window
		 */
		
		
		
		
	}
}

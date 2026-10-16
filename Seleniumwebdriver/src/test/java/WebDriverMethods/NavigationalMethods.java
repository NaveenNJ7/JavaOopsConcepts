package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		URL url = new URL("https://tutorialsninja.com/demo/");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Title of the page :"+driver.getTitle());
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		System.out.println("Title of page :"+driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle()+" and "+driver.getCurrentUrl());
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle()+" and "+driver.getCurrentUrl());
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
	}
}

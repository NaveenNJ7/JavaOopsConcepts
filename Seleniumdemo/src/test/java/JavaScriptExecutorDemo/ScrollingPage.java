package JavaScriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	/*	// scrolling page by pixel number 
		// 0 is initial position of the scroll bar
		js.executeScript("window.scrollBy(0, 700)", "");
		System.out.println("value of pixel using pixel number :"+js.executeScript("return window.pageYOffset;")); */
		
	/*	// scrolling page till the element visible
		WebElement heading = driver.findElement(By.xpath("//h2[normalize-space()='Dynamic Web Table']"));
		
		js.executeScript("arguments[0].scrollIntoView();", heading);
		System.out.println("Value of pixel using till element visible :"+js.executeScript("return window.pageYOffset;")); */
		
		// scrolling page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
	}

}

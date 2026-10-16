package Day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demoxpath {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
	    driver.manage().window().maximize();
	    
	    Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(10))
	    		.pollingEvery(Duration.ofSeconds(2))
	    		.ignoring(NoSuchElementException.class);
	    
	    WebElement username = mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@id='name']"));
		     }
		   });
	    
	    username.sendKeys("Superb");
	  
		
	}
}

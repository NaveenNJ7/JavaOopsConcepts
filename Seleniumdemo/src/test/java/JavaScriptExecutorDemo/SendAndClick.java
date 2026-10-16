package JavaScriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendAndClick {

	public static void main(String[] args) throws InterruptedException {
		
		// we can use both
	/*	ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = driver;  */
		
		WebDriver driver = new ChromeDriver();
		//upcasting
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
		
		//stringscript
		// sending keys
		js.executeScript("arguments[0].setAttribute('value','Great')", name);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value', 'Do well')", email );
		Thread.sleep(2000);
		
		// click
		js.executeScript("arguments[0].click()", radiobutton);
		
	}
}

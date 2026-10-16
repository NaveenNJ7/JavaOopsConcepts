package AlertsPrompt;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		
		driver.manage().window().maximize();
		
	  /*  driver.findElement(By.xpath("//a[@id='alert']")).click();
	    
	    Alert text = driver.switchTo().alert();
	    
	    System.out.println(text.getText());
	    
	    text.accept(); */
		
	/*	driver.findElement(By.xpath("//a[@id='empty-alert']")).click();
		
		Alert text = driver.switchTo().alert(); // we can also write driver.switchTo().alert().accept();
		
		text.accept();
	    
		*/
		
		driver.findElement(By.xpath("//a[@id='prompt']")).click();
		
	    Alert textbox = driver.switchTo().alert();
	    
	    Thread.sleep(1000);
	    
	    // we can not see suppose if we send any text in text box
	    textbox.sendKeys("Chennai to Solapur");
	    
	    textbox.accept();
	    
	    
	    
	/*    driver.findElement(By.xpath("//a[@id='prompt']")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().alert().dismiss(); */
		
	}
}

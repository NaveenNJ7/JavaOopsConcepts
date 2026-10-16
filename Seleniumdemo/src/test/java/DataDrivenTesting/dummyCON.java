package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummyCON {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://13.203.212.5/contact_us");
	    driver.manage().window().maximize();
	    
		
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("name");
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8523697415");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Your Email']")).sendKeys("abcdef@gmail.com");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//textarea[@id='field-2']")).sendKeys("All time great player Sachin Thendulkar");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value='Submit']")).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
    	
    	System.out.println("Test passed");
	}

}

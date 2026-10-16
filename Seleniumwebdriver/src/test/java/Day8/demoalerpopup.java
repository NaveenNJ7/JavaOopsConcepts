package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoalerpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		/*
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		first it will switch to alert or popup
		then it will click on ok button using accept method
		*/
		
		
		/*
		 * 
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); 
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept(); 
		driver.switchTo().alert().dismiss(); // click on cancel button using dismiss() method
		
		*/
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}

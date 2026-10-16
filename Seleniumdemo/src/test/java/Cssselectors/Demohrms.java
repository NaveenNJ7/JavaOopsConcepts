package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demohrms {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//in java we cant write double quotes within double quotes, so we use slash before the value
		
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
	//	driver.findElement(By.cssSelector("input.oxd-input[placeholder=\"Password\"]"));
		
	    // getting error 
		
		
		
	}
	
}

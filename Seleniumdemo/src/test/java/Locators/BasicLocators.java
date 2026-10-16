package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/");
		
		driver.manage().window().maximize();
		
	    String title = driver.getTitle();
	    
	    System.out.println("Title of the page :"+title);
	    
	    driver.findElement(By.id("menu-item-20")).click();
	    
	    driver.findElement(By.linkText("Test Login Page")).click();
	    
	 //   driver.findElement(By.name("username")).sendKeys("Student");
	    
	 //   driver.findElement(By.id("password")).sendKeys("Password123");
	    
	    // here password and username incorrect so its not working
	    
	   driver.findElement(By.id("submit")).click();
		
	   
	   
		
		
		
		
		
		
		
	}
}

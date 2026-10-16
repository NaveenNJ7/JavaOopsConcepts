package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
	  
		System.out.println("Title of page :"+driver.getTitle());
		
		List<WebElement>textbox = driver.findElements(By.className("form-control"));
		
		System.out.println("No of textbox having same class name: "+textbox.size());
		
		driver.findElement(By.id("name")).sendKeys("Practice");
		
		driver.findElement(By.id("email")).sendKeys("Practice.well@gamil.com");
		
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		
		driver.findElement(By.id("textarea")).sendKeys("Practice will and do well and work hard");
	}

}

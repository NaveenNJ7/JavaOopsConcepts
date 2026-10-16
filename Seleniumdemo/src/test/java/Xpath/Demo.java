package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	//	driver.manage().window().maximize();
		
	//	System.out.println(driver.getTitle()); 
		
		// xpath with single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		// xpath with multiple attributes
	 //	driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		
		// xpath with and operator
	//	driver.findElement(By.xpath("//input[@id='password'and @name='password']")).sendKeys("secret_sauce");
		
		// xpath with or operator
		// using or operator if we any of one value is correct and one it wrong its work fine because of or operator
		driver.findElement(By.xpath("//input[@id='password'or @name='password']")).sendKeys("secret_sauce");
		
		//x path with text() method used for inner text
		boolean status = driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed();
		System.out.println(status);
		
		// getText() used to get the text 
		 String text = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		 System.out.println(text);
		 
		// xpath with contains 
		 /*
		  in contains method if we pass the partial value of attribute it will work fine,actual text is login-button
		  we can send login or button its fine
		  */
		// driver.findElement(By.xpath("//input[contains(@name,'login-button')]")).click();
		 
		 // chained x path need to practice
		 
		 
		 
		
	}
	
}

package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demoone {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
 		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("#login-button")).click();
	
		driver.findElement(By.cssSelector("a[id='item_0_title_link'] div[class='inventory_item_name ']")).click();
		
		driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.cssSelector("#add-to-cart")).click();
        		
		
		
		
		
		
		
	}
	
}

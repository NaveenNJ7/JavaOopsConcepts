package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCssselectors {

	public static void main(String[] args) throws InterruptedException {
		
		// Css selectors
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		//tagname and id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Shirt");
		
		//Thread.sleep(2000);
		
		// tagname and attribute
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
		
		
		
		
		
		
	}
}

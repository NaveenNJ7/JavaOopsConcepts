package MethodsinDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		// access these commands through web elements
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		// 1) isDisplayed() - it work on all web elements (static and dynamic
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("logo display status :"+logo.isDisplayed());
		
		// 2) isEnable() - check enable and disable status of the web elements which is operational element
		WebElement box = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Box is enable status :"+box.isEnabled());
		
		// 3) isSelected() -check status of element is selected or not
		WebElement mr = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("male radio button status :"+mr.isSelected());
		
		boolean fr = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		System.out.println("female radio button status :"+fr);
		
		mr.click();
		System.out.println("male radio button status :"+mr.isSelected());
		System.out.println("female radio button status :"+fr);
		
		
		
	}
	
}

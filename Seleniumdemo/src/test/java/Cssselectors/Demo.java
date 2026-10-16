package Cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		// short cut key for import cont+shift+o
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//tagname and id
		driver.findElement(By.cssSelector("input#name")).sendKeys("Master");
		
		//tagname, classname and attribute
		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Enter EMail\"]")).sendKeys("Blaster");
		
		// tagname and attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Enter Phone\"]")).sendKeys("9632587415");
		
		/*
		 in class value suppose space is there between text, remove the text after space
		 */
		// tagname and classname
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Master Blaset Jersy No.10");
		
		
		
		
		
	}

}

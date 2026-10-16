package LocatorsCssXpath;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		System.out.println("Title of the page: "+driver.getTitle());
		
		driver.findElement(By.cssSelector("img#enterimg")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Anup");
		String text = driver.findElement(By.xpath("//label[text()='Full Name* ']")).getText();
		System.out.println("Name text box :"+text);
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kuldeep");
		
		driver.findElement(By.cssSelector("textarea.form-control[ng-model='Adress']")).sendKeys("Cant disclose");
		
	    String textA = driver.findElement(By.xpath("//label[text()='Address']")).getText();
	    System.out.println("Address text box :"+textA);
	    
	    driver.findElement(By.cssSelector("input.form-control[ng-model='EmailAdress']")).sendKeys("Dummy@hmail.com");
	    String textE = driver.findElement(By.xpath("//label[text()='Email address*']")).getText();
	    System.out.println("Email text box :"+textE);
	    
	    driver.findElement(By.xpath("//input[contains(@ng-model,'Phone')]")).sendKeys("5555544444");
	    String textP = driver.findElement(By.xpath("//label[text()='Phone*']")).getText();
	    System.out.println("Phone text box :"+textP);
	    
	    
		
		
		
		
		
	}
}

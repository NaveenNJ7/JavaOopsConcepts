package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println("Title of the page : "+Title);
		
		if(Title.equals("nopCommerce demo store"))
		{
			System.out.println("Title of page valid");
		}                                      
		else
		{
			System.out.println("Title not valid");
		}
		
		boolean displayed = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).isDisplayed();
		
		System.out.println("Logo Displayed : "+displayed);
		
		driver.findElement(By.xpath("//a[text()='Jewelry ']")).click(); 
		
	/*	driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.id("Email")).sendKeys("perfect@gmail.com");
		
		driver.findElement(By.cssSelector("input#Password")).sendKeys("Aasd@1234"); */
		
		
		
	}
	
}

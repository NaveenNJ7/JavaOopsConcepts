package PracticeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		boolean logodisplay = driver.findElement(By.linkText("Qafox.com")).isDisplayed();
		
		System.out.println("logo display :"+logodisplay);
		
		driver.findElement(By.name("search")).sendKeys("Tshirt");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Desktops")).click();
		
		driver.quit();
	}

}

package TestNGConversion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrms {

	/*
	 Logodisplay
	 Login
	 close
	 */
	
	//if we declare this in method, it will become local so declare it in outside, global
	WebDriver driver; 
	
	@Test(priority=1)
	void openapp() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	void Logodisplay() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean Logodisplay = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo Displayed "+Logodisplay);
	}
	
	@Test(priority=3)
	void Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority=4)
	void close()
	{
		driver.close();
	}
	
	
	
	
}

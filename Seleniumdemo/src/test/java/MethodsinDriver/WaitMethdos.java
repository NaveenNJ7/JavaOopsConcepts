package MethodsinDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethdos {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
     	// implicit wait most of the time we use this wait method only, because we can write easily
		// we should write this after the driver object
		// for complex project we can use explicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		
		// after the webdriver we should write this
		/*WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement text = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		text.sendKeys("Admin"); */
		
	}
}

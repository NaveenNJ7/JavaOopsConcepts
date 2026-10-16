package TechProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NamingTextField {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://13.203.212.5/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nav-button-wrapper desktop']//div[@class='outline-button-arrow-block']")).click();
		
		WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		
		
		
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@value='Submit']"));
		String [] data = {"Yo", "7777","!#$%%", "+-*/"}; 
		/*
		 "Java" if we add this to array, it will throw exception because it it valid text
		 if we send we will not get any error message, so it will give exception.
		 this programmer is for just capturing the different error message for different values
		 */
		
		for(String value: data)
		{
			nameField.clear();
			nameField.sendKeys(value);
			btnSubmit.click();
			WebElement ErrorMsg =  driver.findElement(By.xpath("//label[@id='name-error']"));
			System.out.println("Value :"+value+" Error Message>>"+ErrorMsg.getText());
			
			Thread.sleep(2000);
		}
		driver.quit();
	}
	
}

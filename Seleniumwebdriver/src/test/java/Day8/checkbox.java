package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		boolean namebox = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println("Name box selected or not : "+namebox);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Automation");
		
		//selecting single checkbox
	//	driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		
		/*
		 	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		// selecting all checkbox
		for(WebElement checkbox: checkboxes)
		{
			//Thread.sleep(2000);
			checkbox.click();
		}  
		 */
		
		/*
		// normal for loop
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			Thread.sleep(2000);
			checkboxes.get(i).click();
		}
		 */
	
		/*
		// selecting starting checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		}
		 */
		
		/*
		// selecting last 3 checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//starting index = total no.of checkboxes - no.of checkboxes want to select = 7-3 = 4
		for(int i=4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		 */
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i = checkboxes.size()-1; i>=4; i--)  // size is 7 but index value is 6
		{
			Thread.sleep(1000);
			checkboxes.get(i).click();
		}
		
		
	}

}

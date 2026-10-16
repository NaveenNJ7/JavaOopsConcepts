package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingAll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	  /*  for(WebElement chkbox: checkboxes)
	    {
	    	chkbox.click();
	    	Thread.sleep(1000);
	    } */
		
		for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
			Thread.sleep(1000);
		}
	    
	    Thread.sleep(2000);
	    driver.close();
	}
}

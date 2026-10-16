package SelectingCheckBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		
		driver.manage().window().maximize();
		
	//	driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		// using normal for loop
	/*	for(int i=0; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		/*
		 using for each loop we can select all check boxes but if we want to select specific 
		 check box we need to use normal for loop. because for each loop is not index base and does not have get()
		 */
		
	/*	for(WebElement checkbox: checkboxes)
		{
			checkbox.click();
		}
		*/
		
	/*	for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();
		} 
		*/
		// total no = 7, last 3 click, so 7-3 = 4, so index should start from i=4
		for(int i=4; i<checkboxes.size(); i++)
		{
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(WebElement checkbox: checkboxes)
		{
			if(checkbox.isSelected())
			{
				checkbox.click();
			}
		}
		
	}
}

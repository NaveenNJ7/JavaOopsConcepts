package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select droplist = new Select(dropdown);
		
		//droplist.selectByVisibleText("Germany");
		
		//droplist.selectByValue("france");
		
		//droplist.selectByIndex(5);
		
		List<WebElement> options = droplist.getOptions();
		
		System.out.println("No of dropdowns :"+options.size()+" and list");
		
		// using for loop
	/*	for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		} */
		
		// using for each loop
		
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
	}
}

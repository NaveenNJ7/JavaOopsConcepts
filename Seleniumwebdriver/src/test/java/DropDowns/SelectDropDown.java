package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	    WebElement dropoptions = driver.findElement(By.xpath("//select[@id='country']"));
	    
		
		Select options = new Select(dropoptions);
	//	options.selectByVisibleText("Australia");
	//	options.selectByValue("uk");
	//	options.selectByIndex(4);
		
		List<WebElement> option = options.getOptions();
		System.out.println("Number of options :"+option.size());
		
	/*	for(int i=0; i<option.size(); i++)
		{
			String name = option.get(i).getText();
			System.out.println(name);
		}     */
		
		for(WebElement opt: option)
		{
			System.out.println(opt.getText()); 
		}
		
	}

	
	
	
}

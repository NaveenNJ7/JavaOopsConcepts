package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//li[text()='New Zealand']")).click();
		
		//ul[@class='select2-results__options']//li[@role='treeitem'] // 11 options includin empty
		//li[@class='select2-results__option' and @role='treeitem'] //10
		//li[@class='select2-results__option'] // 10
		
	    List<WebElement> dropoptions = driver.findElements(By.xpath("//li[@class='select2-results__option' and @role='treeitem']"));
		System.out.println("Number of dropdown Options :"+dropoptions.size());
	/*	for(int i=0; i<dropoptions.size(); i++)
		{
			System.out.println(dropoptions.get(i).getText());
		}      */
		
		System.out.println("Options are like this");
		
		for(WebElement opt: dropoptions)
		{
			System.out.println(opt.getText());
		}
		
		
		
		
	}
}

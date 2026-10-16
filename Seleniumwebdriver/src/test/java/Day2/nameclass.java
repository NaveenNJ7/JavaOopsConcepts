package Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameclass {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://stylemirror.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Orange");
		
	    boolean logodisplay	= driver.findElement(By.id("input-search")).isDisplayed();
	
	    System.out.println(logodisplay);
		
	//	driver.findElement(By.linkText("FAQs")).click();
		
	//  driver.findElement(By.partialLinkText("AQs")).click();
		
	//	List<WebElement> header = driver.findElements(By.className("header__actions")); // header__actions
		
	//	System.out.println("No of element : "+header.size());
		
		// List<WebElement> AllLinks= driver.findElements(By.tagName("a"));
	//	System.out.println("No of elements : "+AllLinks.size());
	
	
	}
}


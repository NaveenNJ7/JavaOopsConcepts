package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectorshub {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		//basic locator name
		driver.findElement(By.name("email")).sendKeys("dummy@gmail.com");
		
		// basic locator id
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		
		// Css selector tagname.classname[attribute="Value"]
		driver.findElement(By.cssSelector("input.form-control[placeholder='Enter your company']")).sendKeys("Dream");
		
		// css selector
        driver.findElement(By.cssSelector("div[class='element-companyId'] input[placeholder='Enter your mobile number']")).sendKeys("1234578962");		
		
		//xpath
        driver.findElement(By.xpath("//label[normalize-space()='Country']")).sendKeys("India");
        
        // text(). its correct only but button not working
       // driver.findElement(By.cssSelector("button[value='Submit']")).click(); 
        
       String text = driver.findElement(By.xpath("//h6[text()='Dummy Form']")).getText();
        System.out.println(text);
        
	}
}

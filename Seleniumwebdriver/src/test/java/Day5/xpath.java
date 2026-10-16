package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); //  
		
		driver.get("https://stylemirror.in/");
		driver.manage().window().maximize();
		
		driver.getTitle();
		System.out.println("Title of the page : "+driver.getTitle());
		
		boolean display = driver.findElement(By.linkText("FAQs")).isDisplayed();
		System.out.println("Displayed : "+display);
		
		driver.findElement(By.id("input-search")).sendKeys("perfect");
		
	    
		/*driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name *']")).sendKeys("john");
		
	    driver.findElement(By.cssSelector("input[placeholder='Email *']")).sendKeys("johncena@gmail.con");
	    
	    driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("7418529635");
		
		driver.findElement(By.cssSelector("textarea[placeholder=\"Message *\"]")).sendKeys("Get your hands dirty with codes"); */
		
		
	
	}
}

package PracticeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCSS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		// My account- tag and class
	    driver.findElement(By.cssSelector("a.dropdown-toggle[title=\"My Account\"]")).click();
	    Thread.sleep(3000);
	    
	    // Register -link text
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(2000);
	    
	    // input box name - tag and id
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Practice");
		
		// search box - tagname and classname
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Tshirt");
		
		// search box - tagname and attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Tshirt");
		
		// search box - tagname,classname and attribute
		//driver.findElement(By.cssSelector("input.form-control[placeholder=\"Search\"]")).sendKeys("Tshirt");
		
		
		
		
		
	}
}

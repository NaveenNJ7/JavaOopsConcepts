package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
	    WebElement box1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		box1.sendKeys("Practice well");
		
		Actions act = new Actions(driver);
		
		// contr+A - select all text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		// contr+C - copy text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
		
		// move to next box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		// contr+v paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
	/*	// contr+shift+A
	    if there are two keys using, then second key(shift) should release first and then 1st key(control)
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		
		// Enter
		 act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		 
		*/
		
		
		
		
	}
}

package KeyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		
		WebElement icon = driver.findElement(By.xpath("//img[@id='enterimg']"));
		Actions act = new Actions(driver);
		System.out.println("Title of page :"+driver.getTitle());
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).click(icon).keyUp(Keys.CONTROL).perform();
		
		 
		List<String> ids = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("superb");
		System.out.println("Title of page :"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.switchTo().window(ids.get(0));
		System.out.println("Title of page :"+driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}

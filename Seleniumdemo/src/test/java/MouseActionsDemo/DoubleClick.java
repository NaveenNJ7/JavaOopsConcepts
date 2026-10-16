package MouseActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		Thread.sleep(3000);
		field1.sendKeys("Do Hard Work");
		
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement btnclk=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(btnclk).build().perform();
		
		String data = field2.getAttribute("value");
		if(data.equals("Do Hard Work"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}
}
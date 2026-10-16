package MouseActionsDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
	
		Actions act=new Actions(driver);
		act.contextClick(rightClick).build().perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='Edit']")).click();
		Thread.sleep(2000);
		Alert window= driver.switchTo().alert();
		System.out.println(window.getText());
		Thread.sleep(2000);
		window.accept();
		
		
		driver.close();
	}
}

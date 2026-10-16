package MouseActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		WebElement source= driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement target= driver.findElement(By.xpath("//div[@id='droparea']"));
		
		WebElement source2= driver.findElement(By.xpath("//img[@id='mongo']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		act.dragAndDrop(source2, target).perform();
		
		Thread.sleep(1000);
		driver.close();
		
		
	}
}

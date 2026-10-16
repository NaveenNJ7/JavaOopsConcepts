package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropMouseAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		//create object for Actions class 
		Actions act = new Actions(driver);
		
		//select elements for drag and drop
		WebElement dropoption = driver.findElement(By.xpath("//div[@id='droparea']"));
		WebElement dragoption = driver.findElement(By.xpath("//img[@id='angular']"));
		
		// drag the element, drag element should be write in source and drop-should be in target
		act.dragAndDrop(dragoption, dropoption).perform();
		
		//selecting second element
		WebElement drag2 = driver.findElement(By.xpath("//img[@id='mongo']"));
		
		Thread.sleep(2000);
		act.dragAndDrop(drag2, dropoption).perform();
		
		//selecting third element
		Thread.sleep(2000);
		WebElement drag3 = driver.findElement(By.xpath("//img[@id='node']"));
		
		act.dragAndDrop(drag3, dropoption).perform();
	}
}

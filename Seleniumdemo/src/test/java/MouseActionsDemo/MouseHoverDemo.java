package MouseActionsDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement dropSwitch=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement dropAlerts=driver.findElement(By.xpath("//a[text()='Alerts']")); 
		
	/*	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropAlerts = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Alerts']")));
		*/
		
		Actions act=new Actions(driver);
		act.moveToElement(dropSwitch).moveToElement(dropAlerts).click().build().perform();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(2000);
		Alert text= driver.switchTo().alert();
		System.out.println(text.getText());
		
		text.accept();
		
		driver.close();
	}
}

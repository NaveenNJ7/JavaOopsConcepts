package MouseAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RigtClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://practice.expandtesting.com/context-menu");
		driver.manage().window().maximize();
		
		WebElement rightclick = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Actions act = new Actions(driver);
		
		// select contextClick(WebElement targeted) actions
		act.contextClick(rightclick).perform();
		
		// Switch to alert and capture text and close it by accept()
		Alert alerttext = driver.switchTo().alert();
		System.out.println(alerttext.getText());
		
		Thread.sleep(2000);
		alerttext.getText();
		alerttext.accept();
		
	}
}

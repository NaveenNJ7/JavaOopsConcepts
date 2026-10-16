package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='HTML4']/div/button")).click();
		
		//for multiple windows, we use for loop
		Set<String> windowsId = driver.getWindowHandles();
		
		for(String winId: windowsId) {
			String title =driver.switchTo().window(winId).getTitle();
			if(title.equals("SDET-QA Blog"))
			{
				driver.close();
			}
			
		}
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Superb");
		Thread.sleep(2000);
		driver.close();
		
	}
}

package Day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsindriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(6000);
		
		String title = driver.getTitle();
		System.out.println("Title of the page : "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Url of the page is : "+url);
		
		String id = driver.getWindowHandle();
		System.out.println("id of the page, it is dynamic and unique : "+id);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>windowIds = driver.getWindowHandles();
		
		System.out.println("Id'S = "+windowIds);
		
		
	}
}

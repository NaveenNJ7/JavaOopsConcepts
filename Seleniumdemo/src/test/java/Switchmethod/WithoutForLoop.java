package Switchmethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutForLoop {

	public static void main(String[] args) {
		
		// without for loop
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(windowIds);
		
		String id = windowlist.get(0);
		String Id = windowlist.get(1);
		
		driver.switchTo().window(Id);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
	}
}

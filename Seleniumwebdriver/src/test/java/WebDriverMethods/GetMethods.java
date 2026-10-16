package WebDriverMethods;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title of page :"+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page :"+url);
		
		//driver.getPageSource(); // page code source
		
		String id = driver.getWindowHandle();
		System.out.println("id of the page :"+id);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		
	}
	
	
}

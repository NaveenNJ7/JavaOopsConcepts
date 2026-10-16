package KeyboardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//using tab key
	/*	driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();   */
		
		// dirver focus in 2 nd window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		
		List<String> ids = new ArrayList<>(driver.getWindowHandles());
		
		System.out.println("Driver focus in 2nd window :"+driver.getTitle());
		
		Thread.sleep(2000);
		driver.switchTo().window(ids.get(0));
		System.out.println("Driver focus in 1st window :"+driver.getTitle());
		
		driver.quit();
		
	}
}

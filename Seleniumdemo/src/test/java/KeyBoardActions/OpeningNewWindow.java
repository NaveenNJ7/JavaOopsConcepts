package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=common/home");
		String id = driver.getWindowHandle();
		
		// opening new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://text-compare.com/");
		//String id1 = driver.getWindowHandle();
		
		// driver is focusing on 2nd window
		System.out.println("Title of new Window :"+driver.getTitle());
		
		// switch back to window 1
		driver.switchTo().window(id);
		System.out.println("Title of 1st window :"+driver.getTitle());
	}
}

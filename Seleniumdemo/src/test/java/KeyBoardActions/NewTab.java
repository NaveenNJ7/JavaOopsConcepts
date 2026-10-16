package KeyBoardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
		System.out.println("Title of 1st tab :"+driver.getTitle());
		String id1 = driver.getWindowHandle();
		
		Thread.sleep(1000);
		
		// opening in new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		//now driver is focusing on 2nd tab
		System.out.println("Title of 2nd tab :"+driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Driver is in 2nd tab");
		
		Thread.sleep(2000);
		//switch back to tab1
		driver.switchTo().window(id1);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")).click();
		System.out.println("Title of 1st tab  again :"+driver.getTitle());
		
		
	}
}

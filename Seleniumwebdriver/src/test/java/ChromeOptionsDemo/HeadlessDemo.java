package ChromeOptionsDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) throws InterruptedException {
		
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("headless");
		
	 WebDriver driver = new ChromeDriver(options);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 driver.manage().window().maximize();
	 
	 String title= driver.getTitle();
	 
	 if(title.equals("Automation Testing Practiced"))
	 {
		 System.out.println("Test case is passed");
	 }
	 else
	 {
		 System.out.println("Test case is failed");
	 }
	 
	 Thread.sleep(2000);
	 driver.quit();
	 
		
	}
}

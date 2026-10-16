package ChromeOptionsDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	public static void main(String[] args) {
		
		// Create object for ChromeOptions
		ChromeOptions opt = new ChromeOptions();
		
		// remember("--headless=new")
		opt.addArguments("--headless=new");
		
		// pass opt into constructor, if we dont pass, headless mode wont work
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		if(title.equals("nopCommerce demo store. Register"))
		{
			System.out.println("Test passed");
		}
		else 
		{
		System.out.println("Test not passed");
		}
		
	}
}

package ChromeOptionsDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromecontrolledByAutomationText {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		// using this we can remove "Chrome is being controlled by automated test software"
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		
	}
}

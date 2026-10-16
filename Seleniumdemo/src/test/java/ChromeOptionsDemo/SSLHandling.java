package ChromeOptionsDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLHandling {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.setAcceptInsecureCerts(true);
		
		WebDriver driver  = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		// suppose without opt in constructor of ChromeDriver, we will get title of the page as - privacy error
		// if we pass opt in constructor we will get actual title name of the  page (expired.badssl.com)
	}
}

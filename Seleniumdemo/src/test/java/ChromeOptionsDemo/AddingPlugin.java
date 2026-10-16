package ChromeOptionsDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddingPlugin {

	public static void main(String[] args) {   
		
		ChromeOptions opt = new ChromeOptions();
		File file = new File("E:\\Java programs\\Seleniumdemo\\CRXFiles\\SelectorsHub-Chrome-Web-Store.crx");
		
		// select - addextensions - filepath          C:\Automation\CRXFiles
		opt.addExtensions(file);
		
		
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		// not getting extension files in automated browser, please watch video-38 again (at end) and try
	}
}

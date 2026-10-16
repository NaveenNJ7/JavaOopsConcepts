package Day7;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalmethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.navigate().to("http://52.66.134.132/"); // URL is String here
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']//a[normalize-space()='Payout']")).click();
		
		driver.navigate().refresh();       */
		
		URL url = new URL("\"http://52.66.134.132/\"");
		
	}
	
}

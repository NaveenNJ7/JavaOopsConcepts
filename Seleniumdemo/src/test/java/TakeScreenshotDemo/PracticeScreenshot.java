package TakeScreenshotDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeScreenshot {

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		File capturedscreen = ts.getScreenshotAs(OutputType.FILE);
		File pathscreen = new File(System.getProperty("user.dir")+"\\Screenshot\\cartFullPage.png");
		capturedscreen.renameTo(pathscreen);
		//after capturing open the folder and refresh and check  */
		
		//specific area
		WebElement password = driver.findElement(By.xpath("//div[@class='page-body']"));
		File capturepassword = password.getScreenshotAs(OutputType.FILE);
		File savepassword = new File(System.getProperty("user.dir")+"\\Screenshot\\pagebody.png");
	    capturepassword.renameTo(savepassword);
		
		
	}
}

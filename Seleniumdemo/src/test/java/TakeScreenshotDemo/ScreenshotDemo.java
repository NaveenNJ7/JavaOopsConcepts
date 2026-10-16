package TakeScreenshotDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Full page
		//Using TakesScreenshot Interface
	/*	TakesScreenshot sc = (TakesScreenshot) driver;
		// take screenshot of fullpage
		File sourcefile =sc.getScreenshotAs(OutputType.FILE);
		// path of the screenshot captured, so create one folder
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
		
		sourcefile.renameTo(targetfile); // copy source file to target file */
		
		// after doing this refresh the Screenshot folder
		
		// spcifif area of page
		// WebElement is also interface, using webelement we are taking screenshot
		WebElement table = driver.findElement(By.xpath("//div[@id='HTML1']"));
		File capturetable = table.getScreenshotAs(OutputType.FILE);
		File pathoftable = new File(System.getProperty("user.dir")+"\\Screenshot\\table.png");
		capturetable.renameTo(pathoftable);
		
		
	}
}

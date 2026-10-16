package Screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File targetfiel = new File(System.getProperty("user.dir")+"\\screenshots\\Fullpage.png");
		
		sourcefile.renameTo(targetfiel);
		
		driver.quit();
		
		
		
	}

}

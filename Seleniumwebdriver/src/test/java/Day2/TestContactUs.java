package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Day2.MyListener.class)
public class TestContactUs {

	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://15.206.163.184/");
		driver.manage().window().maximize();
	}
	
	@Test
	void testContactUs() throws InterruptedException
	{
		POMClass pm = new POMClass(driver);
		Thread.sleep(3000);
		pm.button();
		Thread.sleep(3000);
		pm.name("mayur");
		pm.mail("mayur.7mayu@gmail.com");
		pm.phone("7795650853");
		pm.message("Need to work hard and finish it soon");
		Thread.sleep(5000);
		pm.sendButton();
		
		Thread.sleep(2000);
		boolean display = driver.findElement(By.xpath("//button[text()='OK']")).isDisplayed();
		
		Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

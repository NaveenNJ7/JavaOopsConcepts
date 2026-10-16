package ParallelTestDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoTest {

	WebDriver driver ;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase()) {
		
		case "chrome": driver = new ChromeDriver();break;
		case "edge": driver = new EdgeDriver();break;
		case "firefox": driver = new FirefoxDriver();break;
		default: System.out.println("Invalid browser");
		return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://testautomationpractice.blogspot.com/");
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Automation Testing Practice");
	}
	
	@Test(priority=3)
	void testHeading()
	{
	  boolean display=driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
	  Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void close()
	{
		driver.close();
	}
	
	
}

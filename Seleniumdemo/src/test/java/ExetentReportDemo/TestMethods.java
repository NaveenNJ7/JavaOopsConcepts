package ExetentReportDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestMethods {

	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test(priority=1)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=2)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://testautomationpractice.blogspot.com/");
	}
	
	@Test(priority=3, dependsOnMethods= {"testUrl"})
	void testHeading()
	{
		boolean display = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void testClose()
	{
		driver.close();
	}
	
	
	
	
	
	
}

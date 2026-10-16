package ListenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ListenersWithoutXml {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
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
	void testlogo()
	{
		boolean display = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(display, "true");
	}
	
	@AfterClass
	void mclose()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}

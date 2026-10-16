package ListenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenersInXml {

	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Automation Testing Practice");
	}
	
	@Test(priority=2)
	void testUrl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web");
	}
	
	
	@Test(priority=3, dependsOnMethods= {"testUrl"})
	void testHeading()
	{
		boolean display = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']")).isDisplayed();
		Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void testClose()
	{
		driver.close();
	}
	
	
}

package PracticeListenerClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(PracticeListenerClass.ListenerCl.class)
public class PracticeListener {

	/*
	   Listener class- used to do post actions.
	   post actions means - it will create report and based on test results it will
	   it will update in report.
	   we will create only one listener class, if we create multiple listener class multiple
	   
	   Attach dependency in xml sheet
	   reports will generate, so only one listener class
	   1) first we create class which includes test methods
	   2) listener class which implements ITestListener interface
	   3) create xml and write listener before test
	  
	*/
	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(4000);
		boolean dp =  driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(dp, true);
	}
	
	@Test(priority=2)
	void testTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHR");
	}
	
	@Test(priority=3, dependsOnMethods ={"testTitle"})
	void testUrl() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}

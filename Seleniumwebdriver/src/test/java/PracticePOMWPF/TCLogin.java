package PracticePOMWPF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TCLogin {

	//declaring driver
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{ 
		// creating driver 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	void testLogin() throws InterruptedException
	{
		// creating object and passing driver
		Loginpage lp = new Loginpage(driver);
		Thread.sleep(2000);
		lp.usn("Admin");
		lp.pswd("admin123");
		lp.btn();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

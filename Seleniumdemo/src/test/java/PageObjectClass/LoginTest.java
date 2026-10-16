package PageObjectClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	void testLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUser("Admin");
		lp.setPwd("admin123");
		lp.clickButton();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}

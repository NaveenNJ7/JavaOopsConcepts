package PracticePOMPF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TClogin {

	WebDriver driver;
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	void testLogin() throws InterruptedException
	{
		LoginPOM lpm = new LoginPOM(driver);
		Thread.sleep(2000);
		lpm.loginId("Admin");
		lpm.loginPwd("admin123");
		lpm.click();
		Thread.sleep(3000);
		boolean display = driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();
		
		Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}

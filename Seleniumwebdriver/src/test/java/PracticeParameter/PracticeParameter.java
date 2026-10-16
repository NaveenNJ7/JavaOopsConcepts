package PracticeParameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParameter {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String br)
	{
		switch(br)
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean dp = driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img")).isDisplayed();
		Assert.assertEquals(dp, true);
	}
	
	@Test(priority=2)
	public void title() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=3)
	public void url() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}

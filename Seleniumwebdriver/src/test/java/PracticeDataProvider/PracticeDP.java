package PracticeDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDP {

	WebDriver driver; 
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="dp")
	void login(String mail, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		
		if(status==true)
		{
			System.out.println("Displayed");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,3})
	Object[][] logindata()
	{
		Object[][] data = {{"gajuktw75@gmail.com", "gajuk75ktw"},
				           {"kumyatiru@gmail.com", "kumyatiru"},
				           {"softwaretester@gmail.com", "softwaretester"},
				           {"developer7@gmail.com", "developer7"}
				          };
		return data;
	}
}

package PractPOMPFListener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TCRegister {

	WebDriver driver;     //
	
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	void testLogout() throws InterruptedException
	{
		RegisterPom reg = new RegisterPom(driver);
		reg.register();
		reg.firstName("kumar");
		reg.lastName("kummi");
		reg.email("kumarkummi@gmail.com");
		reg.phone("8497886713");
		reg.password("kumarkummi");
		reg.conpassword("kumarkummi");
		reg.checkbox();
		reg.button();
		
		Thread.sleep(3000);
		boolean  display = driver.findElement(By.xpath("//aside[@id='column-right']/div/a[13]")).isDisplayed();
		Assert.assertEquals(display, true);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
}

package PracticeDataProvider;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {

	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://iconceptcontactsolution.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
    void click() throws InterruptedException
    {
	    Thread.sleep(3000);
    	Actions act = new Actions(driver);
    	WebElement menudrop = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-4']"));
    	WebElement contc = driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
    	act.moveToElement(menudrop).click(contc).build().perform();
    	
    	boolean dp = driver.findElement(By.xpath("//h2[text()='Let’s Talk Solutions Now']")).isDisplayed();
    	Assert.assertEquals(dp, true);
    }
	
	@Test(priority=2, dataProvider = "dp")
	public void submit(String name, String mail, String num, String msg) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(mail);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Phone-No']")).sendKeys(num);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='Message']")).sendKeys(msg);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		boolean okdp = driver.findElement(By.xpath("//button[text()='OK']")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		Assert.assertEquals(okdp, true);
		
		
	}
	
	@DataProvider(name="dp")
	Object[][] contdata()
	{
		Object[][] data = {{"stira","stira@gmail.com","7418852963","keep working on java and selenium"},
				      {"laxmi","laxmi@yahoo.com","7537537535","keep working on java and selenium"},
				      {"rohit","rohit@gmail.com","8529639635","keep working on java and selenium"}
				      
		              };
		return data;
	}
	
	
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
    
}

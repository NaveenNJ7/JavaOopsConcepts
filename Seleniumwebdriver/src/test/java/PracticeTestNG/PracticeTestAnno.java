package PracticeTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeTestAnno {

	WebDriver driver;
	
	@Test(priority=1)
	public void openApp() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		// click on arrow symbol
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
	}
	
	@Test(priority=2)
	public void logoDisplay() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean display = driver.findElement(By.xpath("//img[@alt='image not displaying']")).isDisplayed();
		System.out.println("Logo displayed :"+display);
	}
	
	@Test(priority=3)
	public void widgets() throws InterruptedException
	{
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		WebElement menuoption = driver.findElement(By.linkText("Widgets"));
		WebElement dropoption = driver.findElement(By.xpath("//a[text()=' Accordion ']"));
		
		act.moveToElement(menuoption).moveToElement(dropoption).click().build().perform();
	}
	
	@Test(priority=4)
	public void accordian() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Functionality']/div/div/div/div[2]/div[1]/h4/a")).click();
	}
	
	@Test(priority=5)
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
}

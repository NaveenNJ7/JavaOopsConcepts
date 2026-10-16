package PracticeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTaskopia {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://13.233.73.240/");
		driver.manage().window().maximize();
		
		
		//find element of Banking and Current account
		WebElement menuoption = driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-0']/div[1]"));
		WebElement dropoption = driver.findElement(By.xpath("//nav[@id='w-dropdown-list-0']/a[1]"));
		
		//create an object for Actions class and pass driver in constructor
		Actions act = new Actions(driver);
		act.moveToElement(menuoption).moveToElement(dropoption).click().build().perform();
		
		Thread.sleep(2000);
		String Htext = driver.findElement(By.xpath("//h1[text()='Current Account']")).getText();
		System.out.println("Heading of page -> "+Htext);
		
		driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-0']/following::a[8]")).click();
		Thread.sleep(3000);
		String HCtext = driver.findElement(By.xpath("//h1[text()='Contact Us ']")).getText();
		System.out.println("Heading of Contact us -> "+HCtext);
		
		driver.close();
		
		
	}
}

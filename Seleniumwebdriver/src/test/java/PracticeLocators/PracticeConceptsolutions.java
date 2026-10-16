package PracticeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeConceptsolutions {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://iconceptcontactsolution.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Start button
		driver.findElement(By.xpath("//a[text()='Start Now']")).click();
		
		//contact us page
		driver.findElement(By.xpath("//form[@id='contactusForm']/div[1]/input")).sendKeys("Prutvi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='contactusForm']/div[2]/div[1]/input")).sendKeys("Prutvi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='contactusForm']/div[2]/div[2]/input")).sendKeys("8523697415");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='contactusForm']/div[3]/textarea")).sendKeys("keep practice hard with");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@id='contactusForm']/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='dialog']/div[6]/button[1]")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}

package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		//div[@class='orangehrm-background-container']/div[1]/div[2]/form/div[2]/div[1]/div[2]/div/div[2]/div/div
		//*[@id="app"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i
		
		Thread.sleep(3000);
		List<WebElement> dropoption = driver.findElements(By.xpath("//div[@role='listbox']//div[@role='option']/span"));
		//div[@role='listbox']//div[@role='option'] // for 32 elements (including --select--)
		//div[@role='listbox']//div[@role='option']/span 31 (Without --select--)
		
		System.out.println("Number of drop options :"+dropoption.size());
		for(WebElement opt: dropoption)
		{
			System.out.println(opt.getText());
		}
		
		driver.close();
	}
}

package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHiddenDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		// xpath by 
		driver.findElement(By.xpath("//span[text()='PIM']")).click();	
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
		
	//	driver.findElement(By.xpath("//span[normalize-space()='Assistant manager I']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
		
		System.out.println("No of options "+options.size());
		
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

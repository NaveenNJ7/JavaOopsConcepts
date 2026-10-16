package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// only one frame is there we can use index also
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String date="3";
		String month="October";
		String year="2027";
		
		while(true)
		{
		 String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 
		 if(currentMonth.equals(month) && currentYear.equals(year))
		 {
			 break;
		 }
		 // past year
	//	 driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-w')]")).click();
		
		 // future year
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		Thread.sleep(3000);
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement dt: dates)
		{
			String currentdate = dt.getText();
			if(currentdate.equals(date))
			{
				dt.click();
				break;
			}
			
		}
		
		
		
		
		
		
	}
}

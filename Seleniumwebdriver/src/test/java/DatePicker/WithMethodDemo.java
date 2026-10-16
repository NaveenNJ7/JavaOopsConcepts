package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithMethodDemo {

	static void pastYearMonth(WebDriver driver, String year, String month, String date) throws InterruptedException
	{
		while(true)
		{
			
		 String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	     String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    
	      if(currentMonth.equals(month) && currentYear.equals(year))
	        {
	    	   break;
	        }
	      
	      driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		
		List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
	    for(WebElement dt: dates)
	    {
	    	String actualdate=dt.getText();
	    	if(actualdate.equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	    }
	}
	
	static void futureYearMonth(WebDriver driver, String year, String month, String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		    if(currentMonth.equals(month) && currentYear.equals(year))
		    {
		    	break;
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		
		for(WebElement dt: dates)
		{
			String currentdate=dt.getText();
			
			if(currentdate.equals(date))
			{
				dt.click();
				break;
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//if frame have name and id we can pass directly value of name and id
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//pastYearMonth(driver, "2024", "October", "3");
		futureYearMonth(driver, "2027", "March", "17");
		
		Thread.sleep(2000);
		driver.close();
	}
}

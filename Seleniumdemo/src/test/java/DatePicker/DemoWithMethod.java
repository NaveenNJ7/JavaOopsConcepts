package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWithMethod {
	
	// create methods
	
	static void selectMonthandYear(WebDriver driver, String month, String year)
	{
		//select month and year, path should be common (for all month) and (for all year)
				while(true)
				{
					String actmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String actyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(actmonth.equals(month) && actyear.equals(year))
					{
						break;
					}
					
					//if not match then click next arrow mark
			        //  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			    	  
			        // select past date
			    	   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
	}
	
	static void selectDate(WebDriver driver, String date)
	{
		// select date
				List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td//a"));
				
				for(int i=0; i<dates.size(); i++)
				{
					if(dates.get(i).getText().equals(date))
					{
						dates.get(i).click();
					}
				}
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// switch to frame
		driver.switchTo().frame(0);
		
		// click on date input box
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		//store expected month, date, year in a String
		String month = "January";
		String date = "29";
		String year = "2024";
		
		/* here we are created static method, if we are calling methods in same class
		   then no need to then class.methodname or directly call method
		 */
		selectMonthandYear(driver, month, year);
		selectDate(driver, date);
		
		// we can also pass driver, month, year and date in a single method
	}

}

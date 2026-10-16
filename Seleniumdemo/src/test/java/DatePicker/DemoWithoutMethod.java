package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWithoutMethod {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// if we have only one frame, then pass 0 in frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//first try to send keys in the input, if it accept it fines, if not then pick date, month,year element
		// it is in month/date/year format, input accepting data we entered
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/31/2025"); 
		
		// if not accept then try this, store expected dates in variables
	    String month = "March";
	    String date = "24";
	    String year = "2024";
	    
	    
	    // first find month and year elements
	    // in xpath should not select(January, february like this) we should select common path
	    
	    // selecting month and year
		while(true)
		{
			String actmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String actyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(actmonth.equals(month) && actyear.equals(year))
			{
			    /*
			    if month and year not match, then click arrow symbol, suppose if it match 
			    if condition will break using break break key word	
			    */
				break;
			}
			
			// this xpath is for clicking or selecting future date
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			//this xpath is for clicking or selecting past date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//select date
		    List<WebElement> actdates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		
		    for(WebElement dt: actdates)
		    {
		    	if(dt.getText().equals(date))
		    	{
		    		dt.click();
		    		break;
		    	}
		    	
		    }
		
		
		
		
		
		
		
		
		
		
		
	}
}

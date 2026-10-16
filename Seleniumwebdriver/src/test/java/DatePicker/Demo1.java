package DatePicker;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	//Date picker-1
	static void pastYearMonth(WebDriver driver, String year, String month, String date)
	{
		while(true)
		{
			//month
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			//year
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			//past
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
			}
		
		//dates
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement dt: allDates)
		{
			String currentDate=dt.getText();
			if(currentDate.equals(date))
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
			//month
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			//year
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			//future
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		
		//dates
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement dt: allDates)
		{
			String currentDate=dt.getText();
			if(currentDate.equals(date))
			{
				dt.click();
				break;
			}
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		Scanner sc=new Scanner(System.in);
		
	/*	System.out.println("Enter year");
		String year =sc.next();
		System.out.println("Enter month");
		String month =sc.next();
		System.out.println("Enter date");
		String date =sc.next();  */
		
	//	pastYearMonth(driver, "2024", "April", "14");
		
		futureYearMonth(driver, "2027", "March", "17");
		
		Thread.sleep(3000);
		// date picker-2
		String date1="8";
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		WebElement dropMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select monthoptions = new Select(dropMonth);
		monthoptions.selectByVisibleText("Jul");
		
		WebElement dropYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yearoptions = new Select(dropYear);
		yearoptions.selectByVisibleText("2022");
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td"));
		for(WebElement dt: dates)
		{
			String currentDate=dt.getText();
			if(currentDate.equals(date1))
			{
				dt.click();
				break;
			}
		}
		
		//Date picker 3 we are not able to click the calendar or inspect any element
		// so we are directly sending dates using sendKey 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement startDate = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.id("start-date"))
		);
		startDate.sendKeys("12-02-2026");

		WebElement endDate = driver.findElement(By.id("end-date"));
		endDate.sendKeys("20-02-2026");
	}
	
}

package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DummyTicket {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement txtFrom=driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='source[]']"));
		txtFrom.click();
		txtFrom.sendKeys("Bangalore");
		
		Thread.sleep(3000);
		List<WebElement> Fromcities=driver.findElements(By.xpath("//ul[@class='suggestions-list']//div[@class='subheading']/div"));
	    for(WebElement Fct: Fromcities)
	    {
	    	String Fcity =Fct.getText();
	    	if(Fcity.equals("Bangalore"))
	    	{
	    		Fct.click();
	    		break;
	    	}
	    }
	    
	    Thread.sleep(3000);
	    WebElement txtTo=driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='destination[]']"));
	    txtTo.click();
	    txtTo.sendKeys("New Delhi");
	    
	    Thread.sleep(4000);
	    List<WebElement> Tocities=driver.findElements(By.xpath("//ul[@class='suggestions-list']/li//div[@class='city']"));
	    for(WebElement Tct: Tocities)
	    {
	    	String Tcity=Tct.getText();
	    	if(Tcity.equals("New Delhi"))
	    	{
	    		Tct.click();
	    		break;
	    	}
	    }
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='departure[]']")).click();
	    
	    WebElement dropMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    Select monthList=new Select(dropMonth);
	    monthList.selectByVisibleText("Mar");
	    
	    WebElement dropYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	    Select yearList=new Select(dropYear);
	    yearList.selectByVisibleText("2026");
	    
	    String date="20";
	    List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
	    for(WebElement dt: dates)
	    {
	    	if(dt.getText().equals(date))
	    	{
	    		dt.click();
	    		break;
	    	}
	    }
	    
	    WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement btn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='flight_oneway']//input[@value='Buy Dummy Ticket']")));
	    btn.click();
	   // driver.findElement(By.xpath("//form[@id='flight_round']//input[@value='Buy Dummy Ticket']")).click();
	}
}

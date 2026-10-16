package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tech57 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// open the website
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://13.203.212.5/contact_us");
	    driver.manage().window().maximize();
	    
	    // read the file
	    String file = System.getProperty("user.dir")+"\\Testdata\\Tech57.xlsx";
	    
	    int rows = ExcelUtils.getRowCount(file, "ContactUs");
	     System.out.println(rows);
	     
	    for(int r=1; r<=rows; r++)
	    {
	    	String name = ExcelUtils.getCellData(file, "ContactUs", r, 0);
	    	String pnum = ExcelUtils.getCellData(file, "ContactUs", r, 1);
	    	String email = ExcelUtils.getCellData(file, "ContactUs", r, 2);
	    	String message = ExcelUtils.getCellData(file, "ContactUs", r, 3);
	    	
	    	driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(name);
	    	Thread.sleep(1500);
	    	driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(pnum);
	    	Thread.sleep(1500);
	    	driver.findElement(By.xpath("//input[@placeholder='Your Email']")).sendKeys(email);
	    	Thread.sleep(1500);
	    	driver.findElement(By.xpath("//textarea[@id='field-2']")).sendKeys(message);
	    	Thread.sleep(1500);
	    	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	    	Thread.sleep(1500);
	    	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	    	
	    	ExcelUtils.setCellData(file, "ContactUs", r, 5, "Pass");
	    	ExcelUtils.fillGreenColor(file, "ContactUs", r, 5);
	    		
	    }
	    
	    System.out.println("Test passed");
	    driver.quit();
	}
}

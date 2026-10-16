package WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo3x.opencartreports.com/admin/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("demo");
		
		driver.findElement(By.id("input-password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click();
		
		/*//getText() will return string,pages are numbers, we can convert it to numeric format
		//suppose if there are multiple pages are there means follow this
		String pages = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		
		int total_pages = Integer.parseInt(pages.substring(pages.indexOf("(")+1,pages.indexOf("Pages")-1));
		
		
		for(int p=1; p<=total_pages; p++)
		{
			
			
			
		} */
		
		// finding number of rows in table
		int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
		
		System.out.println("Number of rows :"+rows);
		
		int cols = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//thead//td")).size();
		
		System.out.println("Number of cols :"+cols);
		
		// finding number of columns in table
		for(int c=1; c<=cols; c++)
		{
			if(c>1)
			{
				WebElement chname =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr[1]//td["+c+"]"));
				System.out.print(chname.getText()+" ");	
			}
		}
		
		System.out.println(" ");
		
		for(int r=1; r<=rows-1; r++)
		{
			for(int cd=1; cd<=cols; cd++)
			{
			  if((cd>1)&&(cd<(cols-1)))  // (cd>1)&&(cd<(cols-1))
				{
				  WebElement data=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td["+cd+"]"));
				  System.out.print(data.getText()+" ");
				 
				}
			}
			
			System.out.println(" ");
		}
		
		
		//table[@class='table table-bordered table-hover']//tbody//tr[3]//td[9]
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}
}

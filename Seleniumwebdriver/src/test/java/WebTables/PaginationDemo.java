package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		// Pages
		int pages =driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		System.out.println("Total number of pages in table :"+pages);
		
		//rows
		int rows =driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		System.out.println("Total number of rows in each page :"+rows);
		
		//columns
		int cols =driver.findElements(By.xpath("//table[@id='productTable']//th")).size();
		System.out.println("Total number of columns in each page :"+cols);
		
		//Heading
		for(int h=1; h<=cols-1; h++)
		{
			String heading=driver.findElement(By.xpath("//table[@id='productTable']//tr/th["+h+"]")).getText();
			System.out.print(heading+" \t ");
		}
		System.out.println("");
		
		//each page data
		for(int p=1; p<=pages; p++)
		{
			Thread.sleep(5000);
			if(p>1)
			{
				WebElement act_page=driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]"));
			    act_page.click();
			}
			
			//Data		
			for(int r=1; r<=rows; r++)
			{
				for(int c=1; c<cols; c++)
				{
					WebElement data=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td["+c+"]"));
				    System.out.print(data.getText()+" \t ");
				}
				System.out.println(" ");
			}
		}
	    
		
	}
}

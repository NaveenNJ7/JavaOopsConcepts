package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		System.out.println("Total number of rows :"+rows);
		System.out.println("Total number of cols :"+cols);
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++) 
			{
			WebElement data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]"));
			System.out.print(data.getText()+" ");
			}
			System.out.println("");
		}
		
		System.out.println("------------------------------");
		for(int i=2; i<=rows; i++)
		{
			WebElement lng =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[3]"));
			if(lng.getText().equalsIgnoreCase("Java"))
			{
			 WebElement dt = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[1]"));
			 System.out.println(dt.getText()+"   "+lng.getText());
			}
		}
		
		driver.close();
		
	}
}

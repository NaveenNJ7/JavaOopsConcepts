package WebTables;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		
		driver.manage().window().maximize();
		
		WebElement heading = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
		
		System.out.println("Table heading :"+heading.getText());
		
		// we can also mention data type int
		// 1) finding number of rows in a Table
	     // if there is only single table than use this tag name 
		 // int rows = driver.findElements(By.tagName("tr")).size();
		// when we have multiple table in page
		  int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
	    System.out.println("Number of rows in a Table :"+rows);
		
	    // 2) finding number of columns in a Table
		int cols = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
		
		System.out.println("Number of rows in a Table :"+cols);
		
		// 3) Heading name
		List<WebElement> hname = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]//th"));
		for(WebElement nm: hname)
		{
			// \t will give one tab space
			System.out.print(nm.getText()+" ");
		}
		
		// 4) specific row and specific data
		WebElement data = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[2]"));
		
		System.out.println("\n"+data.getText());
		
		System.out.println("--------------------");
		// 5) read data from all rows and columns
		List<WebElement> TableData = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//td"));
		
		System.out.println("BookName  Author Subject Price");
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				/*
				 we cant pass directly r and c into xpath, if we want parameter into xpath dynamically
				 we should write r and c like["+r+"],["+c+"]
				 */
				String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println(" ");
		}
		
		int sum=0;
		for(int r=2; r<=rows; r++)
		{
			String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[4]")).getText();
			//System.out.println(price);  // if we want price value use this
			sum = sum+Integer.parseInt(price);
		}
		System.out.println("Sum of price :"+sum);
		/*
		 here getText() return string format, so price will be in string format, need to convert it to numeric format
		 */
		
		for(int r=2; r<=rows; r++)
		{
			String Author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[2]")).getText();
			if(Author.equals("Mukesh"))
			{
				String book =driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td[1]")).getText();
				System.out.println(book);
			}
		}
	}
	
}


/*
 
		 here after finding elements if we store directly into variable of int data type
		 it will give error, because findElements return List<WebElements>
		 so after finding elements, call size method and then store into variable of int
		 */

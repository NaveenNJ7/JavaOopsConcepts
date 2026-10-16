package PracticeUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tech157 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://15.206.163.184/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='navbar']/div[1]/nav/div[2]/div[1]/div/a")).click();
		
		// reading excel sheet
		String file = System.getProperty("user.dir")+"\\testdata\\Tech157.xlsx";
		int rows = Utilities.getRowsCount(file, "Sheet1");
		int cells = Utilities.getCellCount(file, "Sheet1", 0);
		System.out.println(rows);
		System.out.println(cells);
		
		for(int r=1; r<=rows; r++)
		{
			String name = Utilities.getCelldata(file, "Sheet1", r, 0);
			String email = Utilities.getCelldata(file, "Sheet1", r, 1);
			String phone = Utilities.getCelldata(file, "Sheet1", r, 2);
			String msg = Utilities.getCelldata(file, "Sheet1", r, 3);
			
			
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='number']")).sendKeys(phone);
			driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(msg);
			
			Thread.sleep(4000);
            driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			
		}
		driver.quit();
		
	}
}

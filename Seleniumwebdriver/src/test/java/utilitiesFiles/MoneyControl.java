package utilitiesFiles;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyControl {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		/*
		1) data reading from xl
		2)  
		*/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String file = System.getProperty("user.dir")+"\\testdata\\Bank.xlsx";
		int rows = ExcelUtilities.getRowsCount(file, "Sheet1");
		
		for(int r=1;r<=rows; r++)
		{
			String princi = ExcelUtilities.getCelldata(file, "Sheet1", r, 0);
			String roi = ExcelUtilities.getCelldata(file, "Sheet1", r, 1);
			String period1 =  ExcelUtilities.getCelldata(file, "Sheet1", r, 2);
			String period2 = ExcelUtilities.getCelldata(file, "Sheet1", r, 3);
			String freq = ExcelUtilities.getCelldata(file, "Sheet1", r, 4);
			String exp_mat = ExcelUtilities.getCelldata(file, "Sheet1", r, 5);
			
			driver.findElement(By.xpath("//input[@name='principal']")).sendKeys(princi);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select perdrop = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrop.selectByVisibleText(period2);
			
			Select frqdrop = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frqdrop.selectByVisibleText(freq);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			String act_mat = driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			if(Double.parseDouble(exp_mat)==Double.parseDouble(act_mat))
			{
				System.out.println("Test passed");
				ExcelUtilities.setCellData(file, "Sheet1", r, 7, "Pass");
				ExcelUtilities.fillGreenColor(file, "Sheet1", r, 7);
			}
			else
			{
				System.out.println("Test failed");
				ExcelUtilities.setCellData(file, "Sheet1", r, 7, "Fail");
				ExcelUtilities.fillRedColor(file, "Sheet1", r, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//form[@id='fdMatVal']/div[2]/a[2]/img")).click();
		}
		
		driver.quit();

		
		
		
	}
}

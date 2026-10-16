package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBITest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true//");
		driver.manage().window().maximize();
		
		String file = System.getProperty("user.dir")+"\\Testdata\\SBI.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "sheet1");
		
		for(int i=1; i<=rows; i++) {
		String price = ExcelUtils.getCellData(file, "sheet1", i, 0);
		String roi = ExcelUtils.getCellData(file, "sheet1", i, 1);
		String per1 = ExcelUtils.getCellData(file, "sheet1", i, 2);
		String per2 = ExcelUtils.getCellData(file, "sheet1", i, 3);
		String Fre = ExcelUtils.getCellData(file, "sheet1", i, 4);
		String Matvalue = ExcelUtils.getCellData(file, "sheet1", i, 5);
		
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		sc.selectByVisibleText(per2);
		Select frdrop = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		frdrop.selectByVisibleText(Fre);
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		//div[@class='CTR PT15']//a[1]
		String actvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
		if(Double.parseDouble(actvalue)== Double.parseDouble(Matvalue))
		{
			System.out.println("Test passed");
			ExcelUtils.setCellData(file, "sheet1", i, 7, "Pass");
			ExcelUtils.fillGreenColor(file, "sheet1", i, 7);
		}
		else
		{
			System.out.println("Test failed");
			ExcelUtils.setCellData(file, "sheet1", i, 7, "Fail");
			ExcelUtils.fillRedColor(file, "sheet1", i, 7);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();
		}
		driver.quit();
	}
}

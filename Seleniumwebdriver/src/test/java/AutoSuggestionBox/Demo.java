package AutoSuggestionBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("artificial");
		
		Thread.sleep(5000);
		List<WebElement> options= driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println(options.size());
		
		Thread.sleep(5000);
		for(int i=0; i<options.size(); i++)
		{
			if(options.get(i).getText().contains("artificial intelligence"))
			{
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", options.get(i));
				break;
			}
		}
		
		driver.close();
	}
}

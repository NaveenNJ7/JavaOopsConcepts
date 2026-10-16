package AutoSuggestionBox;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("//div[@class='wikipedia-searchtable']//input[@type='text']"));
		search.sendKeys("java");
		
		WebElement searchKey=driver.findElement(By.xpath("//div[@class='wikipedia-searchtable']//input[@type='submit']"));
		searchKey.click();
		
		Thread.sleep(3000);
		List<WebElement> links =driver.findElements(By.xpath("//div[contains(@id,'Wikipedia1_wikipedia')]//a"));
		
		//if we search java, more(link) is displaying, so to remover that i used links.size()-1
		for(int l=0; l<=links.size()-1; l++)
		{
			String link =links.get(l).getText();
			if(link.equalsIgnoreCase("Java version history"))
			{
				System.out.println("Link we are selecting :"+link);
				links.get(l).click();
			}
		}
		
		Set<String> ids = driver.getWindowHandles();
		List<String> id = new ArrayList<>(ids);
		
		String id1 = id.get(0);
		String id2 = id.get(1);
		
		Thread.sleep(3000);
	    driver.switchTo().window(id2);
	    System.out.println("URL :"+driver.getCurrentUrl()+" Title :"+driver.getTitle());
		
	    driver.switchTo().window(id1);
	    Thread.sleep(3000);
	    System.out.println("URL :"+driver.getCurrentUrl()+" Title :"+driver.getTitle());
	    
	    driver.navigate().refresh();
		driver.quit();
		
		
		
		
		
	}
}

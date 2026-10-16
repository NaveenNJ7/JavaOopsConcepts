package KeyBoardActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkOpeningInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		Actions act  = new Actions(driver);
		WebElement feature = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']"));
		
		/*
		 contr+click = suppose in a page, if we want to open any link in another tab we press key control and click
		 new tab will open.
		 but driver will focusing one first tab only. 
		 */
		act.keyDown(Keys.CONTROL).click(feature).keyUp(Keys.CONTROL).perform();
		
		// Set does not have method so store it in List and then we can get id of particular page
		Set<String> ids = driver.getWindowHandles();
		
		List<String> id = new ArrayList(ids);
		
		driver.switchTo().window(id.get(1));
		String title_tab1 = driver.switchTo().window(id.get(1)).getTitle();
		System.out.println("New Tab title :"+title_tab1);
		Thread.sleep(4000);
		
		driver.switchTo().window(id.get(0));
		String title_tab2 = driver.switchTo().window(id.get(0)).getTitle();
		System.out.println("First Tab title :"+title_tab2);
	}
}

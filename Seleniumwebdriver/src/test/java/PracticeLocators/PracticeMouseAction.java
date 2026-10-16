package PracticeLocators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class PracticeMouseAction {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://iconceptcontactsolution.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement menuoption = driver.findElement(By.xpath("//nav[@role='navigation']/div[5]/div[1]/div[1]"));
		Thread.sleep(2000);
		WebElement dropoption = driver.findElement(By.xpath("//nav[@id='w-dropdown-list-4']/div[1]/div[1]/div/div/a[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(menuoption).moveToElement(dropoption).click().build().perform();
		
		Thread.sleep(3000);
		String HText = driver.findElement(By.xpath("//h2[text()='Let’s Talk Solutions Now']")).getText();
		System.out.println("Heading -> "+HText);
		
		driver.close();
	}
}

package JavascriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	/*	js.executeScript("window.scrollBy(0,1000)");
		System.out.println(js.executeScript("return window.pageYOffset"));  */
		
	/*	WebElement table =driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
		js.executeScript("arguments[0].scrollIntoView()", table);
		System.out.println(js.executeScript("return window.pageYOffset")); */
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset"));
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='100%'");
		
		Thread.sleep(2000);
		WebElement name =driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Dowell')", name);
		
		Thread.sleep(2000);
		WebElement radio =driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radio);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}

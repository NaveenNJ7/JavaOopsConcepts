package JavascriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		JavascriptExecutor js = driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('value','superb')", name);
	}
}

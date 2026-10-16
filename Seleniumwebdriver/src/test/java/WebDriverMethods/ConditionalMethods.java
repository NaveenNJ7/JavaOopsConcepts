package WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement display = driver.findElement(By.linkText("GUI Elements"));
		System.out.println("Logo displayed :"+display.isDisplayed());
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println("Textbox enable :"+textbox.isEnabled());
		
		WebElement Mbtn = driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println("is male button selected :"+Mbtn.isSelected());
		
		WebElement Fbtn = driver.findElement(By.xpath("//input[@id='female']"));
		Fbtn.click();
		System.out.println("is femalte button selected :"+Fbtn.isSelected());
	}
}

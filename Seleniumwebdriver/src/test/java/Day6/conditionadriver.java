package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionadriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://demo.nopcommerce.com/");
	//	driver.manage().window().maximize();
		
	//	Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println("Name input box enable : "+name.isEnabled());
		
		System.out.println("Before selecting radio buttons");
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println("Male Radio button selected : "+male.isSelected());
		
		WebElement female= driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Female Radio button selected : "+female.isSelected());
		
		System.out.println("-------------------------------------------------");
		System.out.println("After selecting Male radio buttons");
		male.click();
		System.out.println("Male Radio button selected : "+male.isSelected());
		System.out.println("Female Radio button selected : "+female.isSelected());
		
		System.out.println("-------------------------------------------------");
		System.out.println("After selecting Female radio buttons");
		female.click();
		System.out.println("Male Radio button selected : "+male.isSelected());
		System.out.println("Female Radio button selected : "+female.isSelected());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

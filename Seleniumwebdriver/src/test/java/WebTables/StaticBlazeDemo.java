package WebTables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticBlazeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement fromdrop= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select from = new Select(fromdrop);
		from.selectByVisibleText("Mexico City");
	    
		Thread.sleep(2000);
		WebElement todrop =  driver.findElement(By.xpath("//select[@name='toPort']"));
		Select to = new Select(todrop);
		to.selectByVisibleText("Rome");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		List<WebElement> priceElements = driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td[6]"));
	    
		List<Double> priceList=new ArrayList<>();
		
		for(WebElement price: priceElements)
		{
			String pricetext =price.getText().replace("$", "");
			priceList.add(Double.parseDouble(pricetext));
		}
	
		System.out.println(priceList);
		
		double LowestPrice = Collections.min(priceList);
		System.out.println(LowestPrice);
	
		driver.findElement(By.xpath("//table[@class='table']//tbody/tr[3]/td[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@method='POST' ]//input[@name='inputName']")).sendKeys("Pravin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@method='POST']/div[2]//input")).sendKeys("5th main road");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='control-group']//input[@id='city']")).sendKeys("Dhannur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("BGK");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("55447");
		Thread.sleep(1000);
		
		WebElement dropcardType = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select cardType = new Select(dropcardType);
		cardType.selectByValue("dinersclub");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("4242 4242 4242 4242");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2022");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Basu bugudi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
		WebElement Heading =driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']"));
		if(Heading.getText().equals("Thank you for your purchase today!"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		Thread.sleep(1000);
		driver.close();
	}
}

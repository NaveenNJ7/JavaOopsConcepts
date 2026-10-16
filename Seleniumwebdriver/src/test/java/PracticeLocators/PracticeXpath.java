package PracticeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//with single attribute
		// //tag[@attribute='value']
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tshirt");
		
		
		//with multiple attributes -> //tag[@attribute='value'][@attribute='value'] 
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");
		
		//with or and operators -> //tag[@attribute='value' and @attribute='value']
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tshirt");
		
		// //tag[@attribute='value' or @attribute='value']
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Tshirt");
		
		// text() method -> //tag[text()='value']
		//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
		// link text
		//driver.findElement(By.linkText("MacBook")).click();
		
		// contains method
		//driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("Tshirt");
		
		// contains with text() -> //tag[contains(text(),'value')]
		//driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")).click();
		
		// starts-with method
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Tshirt");
		
		// chained xpath -> combination of absolute xpath and relative xpath
		//driver.findElement(By.xpath("//div[@id='search']/input")).sendKeys("Tshirt");
		
		// software menu option // using devtool //*[@id="menu"]/div[2]/ul/li[5]/a
	    driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[5]")).click();
	    Thread.sleep(2000);
	    // after clicking software Desktop option (//a[text()='Desktops (13)'])
		driver.findElement(By.xpath("//div[@id='product-category']/div/aside/div[1]/a[1]")).click();
		
		// desktop heading
		String text = driver.findElement(By.xpath("//div[@id='product-category']/div/div/h2")).getText();
	    System.out.println(text);
	    
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}

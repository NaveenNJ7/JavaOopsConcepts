package BrokenLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		String text = shadow.findElement(By.cssSelector("#shadow-element")).getText();
		
		System.out.println("Text of element-1 :"+text);
		
	/*	//This Element is inside 2 nested shadow DOM.
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		String text2 = shadow1.findElement(By.cssSelector("#nested-shadow-element")).getText();
		
		System.out.println("Text of element-2 :"+text2); */
		
		//element 2 and 3 have same variable so if we want to print change the variable name
		
		//This Element is inside 3 nested shadow DOM.
		
		SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		Thread.sleep(1000);
		String text3 = shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
	
		System.out.println("Text of element-3 :"+text3);
	}
	
}

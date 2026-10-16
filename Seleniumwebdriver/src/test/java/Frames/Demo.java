package Frames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://ui.vision/demo/webtest/frames/");
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
	    // here frame does not have any attributes like name and id,so we use frame as webelement
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Concentrate");
		
		
		// we should come from frame to main page
		driver.switchTo().defaultContent();
		
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("HardWork");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Dont give up");
		
		//here frame 3 having one more frame, so we should switch using frame index
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='SG0AAe']/div[1]/label/div/div[1]")).click();
		
		//here we are inside iframe,if we want to come main page, just one time use defaultContent()
		//it will come directly outside
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("U must do");
		
		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Keep on work");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}
}

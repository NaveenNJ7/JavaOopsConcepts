package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		// frame-1
		// this is absolute x path for frame1
		//WebElement frame1 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		
		// we can also write our own relative xpath frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Java");
		
		// to come back to main page from frame 1, use 
		driver.switchTo().defaultContent();
		
		// frame-2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		//frame-3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Practice well");
		
		// frame3 contains iframe, suppose any frame having only one frame means, we can switch using index(0)
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.switchTo().defaultContent();
		
		//frame4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\""));
		driver.switchTo().frame(frame4);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Good luck");
	}
}

package MouseActionsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider =driver.findElement(By.xpath("//div[@name='rangeInput']//span[1]"));
		System.out.println("Minimum slider Location of x and y :"+min_slider.getLocation()); // 59,247
		
		//move x to 159, so add 100 to it
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 247).perform(); //159,247
		System.out.println("Minimum slider Location of x and y after moving :"+min_slider.getLocation());
		
		WebElement max_slider=driver.findElement(By.xpath("//div[@name='rangeInput']//span[2]"));
		System.out.println("Maximum slider Location of x and y :"+max_slider.getLocation());// 767,249
		
		act.dragAndDropBy(max_slider, -200, 249).build().perform();
		System.out.println("Maximum slider Location of x and y after moving :"+max_slider.getLocation());
		//568,249
	}
}

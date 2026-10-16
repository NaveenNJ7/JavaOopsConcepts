package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderRangeAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		// creating object of Actions class and pass driver in constructor
		Actions act = new Actions(driver);
		
		// find the element to drag
		WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		
		// find location of x and y
		//min_slider.getLocation();
		System.out.println("Location of co-odrinators x and y before draging slider :"+min_slider.getLocation());
		
		/*
		  location of x is59, if we want to mover to 159, then add 100 to it.
		  after moving also if we find out location of x, it will give near by value not exactly what we want.
		 */
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of co-odrinators x and y after draging slider :"+min_slider.getLocation());
		
		System.out.println("----------------------------------------------------------");
		
		// maximum element
		WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
	    System.out.println("Location of co-odrinators x and y before draging slider :"+max_slider.getLocation());
		
	    /*
		  location of x is767, if we want to mover to 667, then Minus 100 to it.
		  after moving also if we find out location of x, it will give near by value not exactly what we want.
		 */
	    act.dragAndDropBy(max_slider, -100, 257).perform();
	    System.out.println("Location of co-odrinators x and y after draging slider :"+max_slider.getLocation());
	    
		
	}
}

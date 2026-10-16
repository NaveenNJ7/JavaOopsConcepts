package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssdemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // control+shift+o short cut key for import packages
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// By ID attribute -----------
	//	driver.findElement(By.id("small-searchterms")).sendKeys("Desktop");
		
		// By tag#ID -------------==
	//	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Desktop");
	    // or , if we dont write tagname(input) also it is okay, its optional
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Desktop");
		
		// By tag.classname	-----------		
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Desktop");
	//	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Desktop");
		
	    // By tag attribute, tag[attribute="value"],-------------
	//	driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Desk");
		
		/* in java if we want to write double quotation inside double quotation 
		   we need to write forward and backward.
		   otherwise you can keep value in single quotation */
		
	//	driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Desk");
		
		
		// By tag class attribute --------------------
	//	driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("desk");
	//	driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Top");
		
	}
}

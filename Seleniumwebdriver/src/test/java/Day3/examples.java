package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examples {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dreamchallenger.in/");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Dreamchallenger"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		 boolean image = driver.findElement(By.cssSelector("img.img-fluid")).isDisplayed(); // By we need to import
		System.out.println("Image displayed : "+image);
		
    //  driver.findElement(By.linkText("FAQ")).click();
		
    //	driver.findElement(By.linkText("About Us")).click();
		
		driver.findElement(By.linkText("Contact Us")).click();
		
    	driver.findElement(By.cssSelector("input[name ='name']")).sendKeys("Naveen");
		
		driver.findElement(By.cssSelector("input[type ='email']")).sendKeys("navee.n@gmail.com");
		
		driver.findElement(By.cssSelector("input[name ='phone']")).sendKeys("8528528528"); // --- not executed 
		
		driver.findElement(By.cssSelector("textarea[name = 'message'")).sendKeys("Naveen Junja soon will become automation tester");
		
		
		
		}
}

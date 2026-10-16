package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class world11 {

	
	public static void main(String[] args) {
		
		
		// launch browser
		
		WebDriver driver = new ChromeDriver();
		
		//https://11world.in/
		driver.get("https://dreamchallenger.in/");
		
		driver.manage().window().maximize(); // this is for to maximize the window
		
		// validate title 11world
		
		String actual = driver.getTitle();
		
		if(actual.equals("Dreamchallenger"))
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
		
		
		
		
		
	}
}

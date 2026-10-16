package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class FirstAuto {

	
	public static void main(String[] args) {
		
		// Launch browser
		
		//ChromeDriver driver = new ChromeDriver();
		                  //or
		WebDriver driver = new ChromeDriver();
		
		// open URL https://demo.opencart.com/ 
		
		driver.get("https://demo.opencart.com/");
		
		// validate "Your store"
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your stoe"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Not passed");
		}
		
		
	}
}

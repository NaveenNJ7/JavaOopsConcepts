import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://13.201.40.184/");
		
		driver.manage().window().maximize();
		
	    String title = driver.getTitle();
	    
	    System.out.println("Title :"+title);
	    
	    if(title.equals("Fractallflux"))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("Test failed");
	    }
	    
	   // driver.quit();
		
	}
}

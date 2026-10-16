import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
   // WebDriver driver = new WebDriver();       we can use both
	
	//http://13.203.212.5/   // https://demo.opencart.com/
	driver.get("http://13.203.212.5/");
	//tech-project157 = title
	
	// maximize the window
	driver.manage().window().maximize();
	
	// title of the page
   	String title = driver.getTitle();
		
   	System.out.println("Title of the page :"+title);
   	
   	if(title.equals("tech-project157"))
   	{
   		System.out.println("Test passed");
   	}
   	else
   	{
   	    System.out.println("Test failed");	
   	}
   	
   	// driver.close();
   //	driver.quit();
	}
}

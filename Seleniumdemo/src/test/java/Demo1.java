import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://65.1.106.97/");
		
		//Wiselix Software
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
	}

}

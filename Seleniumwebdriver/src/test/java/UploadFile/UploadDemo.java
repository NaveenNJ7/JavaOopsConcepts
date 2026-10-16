package UploadFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDemo {

	
       public static void main(String[] args) throws InterruptedException {
	
    	WebDriver driver = new ChromeDriver();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		driver.get("https://demo.automationtesting.in/Register.html");
   		driver.manage().window().maximize();
   		
   		Thread.sleep(2000);
   		WebElement upload = driver.findElement(By.xpath("//input[@id='imagesrc']"));
   		upload.sendKeys("C:\\Users\\Naveen Junja\\Desktop\\Automation Class\\Framework\\FolderStructure.png"); 
   		
   	/*	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   		WebElement upload = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("imagesrc")));

   		upload.sendKeys("C:/Users/Naveen Junja/Desktop/Automation Class/Framework/FolderStructure.png"); 
   		*/
   }
}

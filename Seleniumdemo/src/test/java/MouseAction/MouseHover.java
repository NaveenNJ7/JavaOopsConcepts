package MouseAction;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        
        // find element on which we want to hover mouse
        WebElement menuoption = driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
        Thread.sleep(1000);
        WebElement dropoption = driver.findElement(By.xpath("//a[normalize-space()='Alerts']"));
        
        // create an object for Actions class and import
        Actions act = new Actions(driver);
        /*
         build() which will create an action
         perform() which will perform an action, both should write end of the actions
         */
       //act.moveToElement(menuoption).moveToElement(dropoption).click().build().perform();
        /*
         if we dont write build() also it works, internally perform() will call build()
         in some scenario we build action and wait for to execute some statements and perform action
         that time we use both methods
         */
         act.moveToElement(menuoption).moveToElement(dropoption).click().perform();
        
         driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
        
         Thread.sleep(2000);
         
         //driver.switchTo().alert().accept();
         Alert popup = driver.switchTo().alert();
         System.out.println(popup.getText());
         
         popup.accept();
        
        driver.close();
	}
}

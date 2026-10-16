package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//if id or name attribute present mention them in double quotes
		driver.switchTo().frame("iframeResult");
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        
        //box1 already have input(weclome), so remove that using clear() and send keys
        box1.clear();
        box1.sendKeys("Good");
        
        // select doubleClick(WebElement target) for double click
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();
		
        // check in both input boxes same text is displaying or not
        /*
         getText() will return inner text of the element
         getAttribute() will return value of the attribute
         if element does not have inner text means, it wont return
         here box1 in DOM does not have inner text, but if use getText() it wont return
         so we should use getAttribut("attribute")
         */
     /* validation box2 should contains "Good"
      suppose if box1 have inner text as "Good", then use getText(), otherwise use getAttribute()

      */
      /*  //this condition will not match
        if(box2.getText().equals("Good"))
        {
        	System.out.println("Text matched");
        }
        else
        {
        	System.out.println("Text not matched");
        }    */
        
        /*
         value attribute for box2 will not show in DOM, but it will generate during run time
         sometime attribute may be text also
         actually in box1 value="Hello world" is present, we sent "Good"
         Here value="Hello World" holds the data, some time text attribute holds the data
         here we captured 'Good' using getAttribute("value")
         */
        
        String text = box2.getAttribute("value"); // it will return in String
        if(text.equals("Good"))
        {
        	System.out.println("Text matched");
        }
        else
        {
        	System.out.println("Text not matched");
        }
		 
	}
}

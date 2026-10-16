package PracticePOMWPF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	
	// create constructor -> without PageFactory
	// receiving driver
	Loginpage(WebDriver driver)
	{
		this.driver=driver; // assigning driver
	}
	
	// locators
	By txt_name = By.xpath("//input[@name='username']");
	By txt_pwd = By.xpath("//input[@name='password']");
    By button = By.xpath("//button[@type='submit']");
    By PIM = By.xpath("//span[text()='PIM']");
    
    //actions
    
    public void usn(String uname)
    {
    	driver.findElement(txt_name).sendKeys(uname);
    }
    
    public void pswd(String pwd)
    {
    	driver.findElement(txt_pwd).sendKeys(pwd);
    }
    
    public void btn()
    {
    	driver.findElement(button).click();
    }
    
    public void pim()
    {
    	boolean dp = driver.findElement(PIM).isDisplayed();
    }
}
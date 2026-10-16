package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	// constructor
	 LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// locators
	By text_username = By.xpath("//input[@placeholder='Username']");
    By text_password = By.xpath("//input[@placeholder='Password']");
    By button_login = By.xpath("//button[normalize-space()='Login']");
	
    //Action methods
	public void setUserName(String uName)
	{
		driver.findElement(text_username).sendKeys(uName);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(text_password).sendKeys(pwd);
	}
	
	public void clickButton()
	{
		driver.findElement(button_login).click();
	}
	
}

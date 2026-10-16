package PageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Constructor using PageFactory
	
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		//PageFactory class present in Selenium webDriver
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement textboxuser;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement textboxpwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement button;
	
	// actions method, always public
	public void setUser(String user)
	{
		textboxuser.sendKeys(user);
	}
	
	public void setPwd(String pwd)
	{
		textboxpwd.sendKeys(pwd);
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	
	
	
	
}

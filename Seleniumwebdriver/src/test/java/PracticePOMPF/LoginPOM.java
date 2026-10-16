package PracticePOMPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	WebDriver driver;
	// with page factory
	LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		/*
		 here we have not using driver to find the elements but
		 PageFactory is a pre defined class present in selenium web driver, calling initElements method
		 it will initiate all the elements using driver(which we pass). in this way pagefactory will help
		 */
	}
	//capturing locator and identifying the element
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_user;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clc;
	
	
	public void loginId(String user)
	{
		txt_user.sendKeys(user);
	}
	
	public void loginPwd(String paswd)
	{
		txt_pwd.sendKeys(paswd);
	}
	
	public void click()
	{
		clc.click();
	}
}

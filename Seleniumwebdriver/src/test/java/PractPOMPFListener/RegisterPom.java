package PractPOMPFListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPom {

	WebDriver driver;
	RegisterPom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//aside[@id='column-right']//a[2]")
	WebElement regi;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement eml;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement phNum;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pword;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement conpword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn;
	
	public void register()
	{
		regi.click();
	}
	
	public void firstName(String nm)
	{
		fname.sendKeys(nm);
	}
	
	public void lastName(String lnm)
	{
		lname.sendKeys(lnm);
	}
	
	public void email(String mail)
	{
		eml.sendKeys(mail);
	}
	
	public void phone(String pNum)
	{
		phNum.sendKeys(pNum);
	}
	
	public void password(String pwd)
	{
		pword.sendKeys(pwd);
	}
	
	public void conpassword(String cpwd)
	{
		conpword.sendKeys(cpwd);
	}
	
	public void checkbox()
	{
		chbox.click();
	}
	
	public void button()
	{
		btn.click();
	}
}

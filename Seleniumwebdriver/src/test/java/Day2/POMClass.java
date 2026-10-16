package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMClass {

	WebDriver driver;
	
	public POMClass(WebDriver driver) {
		this.driver=driver;
	}
	
	By btn = By.xpath("//div[@class='collapse navbar-collapse']/div//span");
	By txt_name = By.xpath("//input[@id='name']");
	By txt_mail = By.xpath("//input[@id='email']");
	By txt_phone = By.xpath("//input[@id='number']");
	By txt_msg = By.xpath("//textarea[@name='message']");
	By btnmsg = By.xpath("//button[@id='submitButton']");
	
	public void button()
	{
		driver.findElement(btn).click();
	}
	public void name(String nm)
	{
		driver.findElement(txt_name).sendKeys(nm);
	}
	
	public void mail(String ml)
	{
		driver.findElement(txt_mail).sendKeys(ml);
	}
	
	public void phone(String ph)
	{
		driver.findElement(txt_phone).sendKeys(ph);
	}
	
	public void message(String msg)
	{
		driver.findElement(txt_msg).sendKeys(msg);
	}
	
	public void sendButton()
	{
		driver.findElement(btnmsg).click();
	}
	
}

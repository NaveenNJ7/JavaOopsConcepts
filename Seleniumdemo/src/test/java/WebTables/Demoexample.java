package WebTables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoexample {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		//select departure drop down
		String dep= driver.findElement(By.xpath("//h2[text()='Choose your departure city:']")).getText();
		System.out.println(dep);
		WebElement depdrop = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depDropDown = new Select(depdrop);
		List<WebElement> depOptions = depDropDown.getOptions();
		for(WebElement dp: depOptions)
		{
			System.out.println(dp.getText());
		}
		depDropDown.selectByValue("Portland");
		
		System.out.println("----------------------------------");
		
		//select destination drop down
		String des = driver.findElement(By.xpath("//h2[text()='Choose your destination city:']")).getText();
		System.out.println(des);
		WebElement desdrop = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select desDropDown = new Select(desdrop);
		List<WebElement> desOptions =desDropDown.getOptions();
		for(WebElement ds: desOptions)
		{
			System.out.println(ds.getText());
		}
		
		System.out.println("------------------------------------");
		
		desDropDown.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		String flights  = driver.findElement(By.xpath("//h3[text()='Flights from Portland to London: ']")).getText();
		System.out.println(flights);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']//tr//th"));
		System.out.println("Number of columns :"+cols.size());
		for(WebElement cl: cols)
		{
			System.out.print(cl.getText()+" ");
		}
		System.out.println(" ");
		
		List<Double> prices = new ArrayList();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr"));
		System.out.println("Number of rows :"+rows.size());
		
		System.out.println("Price list");
		for(int r=1; r<=rows.size(); r++)
		{
			WebElement price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]"));
			//System.out.println(price.getText());
			
			String priceText = price.getText().trim();
			
			priceText = priceText.replace("$","" ).trim();
			
			double pricevalue = Double.parseDouble(priceText);
			
			prices.add(pricevalue);
			
		}
		
		double lowestprice = Collections.min(prices);
		//int number = Integer.parseInt(numberString);
		
		System.out.println("All prices :"+prices);
		System.out.println("Lowes price :"+lowestprice);
		
		WebElement button = driver.findElement(By.xpath("//table[@class='table']//tr[3]//td[1]"));
		
		button.click();
		
		
		
	}
}

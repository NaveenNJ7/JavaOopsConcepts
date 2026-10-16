package ClassAnnotaion;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeTest
	void Login()
	{
		System.out.println("Log in ");
	}
	
	@Test
	void search()
	{
		System.out.println("Search");
	}
	
}

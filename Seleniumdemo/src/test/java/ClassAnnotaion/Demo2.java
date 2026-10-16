package ClassAnnotaion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo2 {

	@AfterTest
	void Logout()
	{
		System.out.println("Log out");
	}
	
	@Test
	void advancesearch()
	{
		System.out.println("advance search");
	}
}

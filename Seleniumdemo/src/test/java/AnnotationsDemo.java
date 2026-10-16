import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	/*
	 Test case
	 login
	 search
	 logout
	 login
	 advance search
	 logout
	  */
	@AfterMethod
	void Logout()
	{
		System.out.println("log out");
	}
	
	@BeforeMethod
	void Login()
	{
		System.out.println("Log in");
	}
	
	@Test(priority=2)
	void Advancesearch()
	{
		System.out.println("Advance search");
	}
	
	@Test(priority=1)
	void Search()
	{
		System.out.println("Search");
	}
	
}

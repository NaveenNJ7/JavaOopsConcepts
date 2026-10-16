package PracticeAnnotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class PracticeBefAftMethods {
/*
   Annotations  - class level
   @BeforeMethod and @AfterMethod
   @BeforeClass  and @AfterClass
   
   Using XML we can use annotations
   @BeforeTest and @AfterTest
   @BeforeSuite and @AfterSuite
   
 */
	
	/*
	   Test case-
	   login
	   search
	   logout
	   login
	   advance search
	   logout
	*/
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Before Login(method)");
	}
	
	@Test(priority=-1)
	public void search()
	{
		System.out.println("Search test");
	}
	
	@Test(priority=0)
	public void advanceSearch()
	{
		System.out.println("Advance Search");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("After method logout(method)");
	}
	
	
}

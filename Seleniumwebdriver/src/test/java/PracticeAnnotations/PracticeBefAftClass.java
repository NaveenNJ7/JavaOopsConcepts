package PracticeAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeBefAftClass {

	/*
	  Test case
	  login
	  search
	  advance search
	  logout 
	*/
	
	@BeforeClass
	public void login()
	{
		System.out.println("login before class");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("logout after calss");
	}
	
	@Test(priority=1)
	public void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=2)
	public void advancesearch()
	{
		System.out.println("advance search");
	}
}

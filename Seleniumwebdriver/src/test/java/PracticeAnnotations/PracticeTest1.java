package PracticeAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTest1 {

	@BeforeTest
	public void login()
	{
		System.out.println("Before test");
	}
	
	@Test
	public void search()
	{
		System.out.println("Search test");
	}
}

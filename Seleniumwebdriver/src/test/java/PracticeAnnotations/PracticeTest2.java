package PracticeAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PracticeTest2 {

	@AfterTest
	public void logout()
	{
		System.out.println("After test");
	}
	
	@Test
	public void advance()
	{
		System.out.println("Advance search test");
	}
	
}

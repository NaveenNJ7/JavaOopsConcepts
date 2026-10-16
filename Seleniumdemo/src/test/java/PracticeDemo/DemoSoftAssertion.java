package PracticeDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssertion {

	@Test
	public void verify()
	{
		SoftAssert sa = new SoftAssert();
		System.out.println("Passed 1");
		
		sa.assertTrue(false);
		
		System.out.println("Passed 2");
		
		sa.assertAll();
	}
}

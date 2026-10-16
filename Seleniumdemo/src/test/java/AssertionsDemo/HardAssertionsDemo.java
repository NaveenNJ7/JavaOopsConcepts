package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsDemo {

	
	//@Test
	void test_HardAssertion()
	{
		System.out.println("Test one");
		
		Assert.assertEquals(1, 1); // passed
		
		/*
		 here Assertion will get pass, so all the statements before the Assert(Test one)
		  and after the Assert (Test two) will get execute.
		 */
		
		System.out.println("Test two");
	}
	
	@Test
	void test_HardAssertion1()
	{
		System.out.println("Test one");
		
		Assert.assertEquals(1, 2); // failed
		
		/*
		 here Assertion will get failed, so all the statements before the Assert(Test one) will get execute
		  but after the Assert (Test two) will not execute.
		  in order to over come this problem we use Soft Assertion
		 */
		
		System.out.println("Test two");
	}
}

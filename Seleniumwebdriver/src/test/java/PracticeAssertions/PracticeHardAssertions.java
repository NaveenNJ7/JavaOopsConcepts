package PracticeAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeHardAssertions {

/*
	Assertions - used for to validate test methods
	 only assertions will make test methods fail and pass
	 these pass and fail will be print in Report
	 Conditional statements wont fail test methods and these will not print in report
	 
	 two types of Assertions
	 1) hard assertion
	 2) soft assertion
	 
	 1) Hard assertions
	 The methods in hard assertions are static so we can access it through Assert class
	 suppose if condition pass, the statements below the condition will execute
	 if condition fail statements below the condition will not execute 
	 for this reason we always write hard assertion at end or we use Soft assertion
	 test method name will starts with test word
	 
*/
 //	@Test
	public void testTitle()
	{
		String exp_title = "Java";
		String act_title = "python";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not matching");
		}
		
	/*
	   here condition is not matching but method got passed,
	   actually test method should get fail so we use assetion	 
	*/
	}
	
//	@Test
	public void testHeading()
	{
		String exp_heading="Java";
		String act_heading="Python";
		
		Assert.assertEquals(exp_heading, act_heading);
		System.out.println("Failed");
	/*
	    Here method will get fail, but print statement will not get execute so we always 
	    write Assert statements at the end  	
	*/
	}
	
//	@Test
	public void testNumber()
	{
		// we can use conditional statement with Assert
		int m = 123;
		int n = 123;
		
		if(m==n)
		{
			System.out.println("Equal");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Not Equal");
			Assert.assertTrue(false);
		}
	}
	
	// few methods in Assert
	@Test
	public void testMethods()
	{
		//Assert.assertEquals(777, "123"); // fail
		//Assert.assertNotEquals("John", "Java"); // pass
		//Assert.assertTrue(false); // fail
		Assert.assertTrue(true); // pass
	}
	
	
	
	
	
	
	
	
	
}

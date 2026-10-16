package AssertionsDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	//@Test
	void test()
	{
		System.out.println("Test one");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2); // passed
		/*
		 even though the Assertion is wrong(1 not equal 2) or Assertion is correct
		 {or 1 is equal to 1} but the result will be passed only
		 and whether it is fail or pass all statements before and after Assertion will get
		 execute.
		 so to over come this we use one method called assertAll() then
		 we will get exact result whether it is failed or passed
		 */ 
		System.out.println("Test two");
	}
	
	@Test
	void test1()
	{
		System.out.println("Test one");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(1, 2);// failed
		
		System.out.println("Test two");
		
		sa.assertAll();
	}
	
}

package AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		// Hard Assertions
		//Assert.assertEquals("john", "john"); // pass
		//Assert.assertEquals("Don", "Illa"); // fail
		
		//Assert.assertEquals(123, 123);// pass
		//Assert.assertEquals("456", 456); // fail
		
		//Assert.assertNotEquals("Sachin", "Kohli"); // pass
		//Assert.assertNotEquals("Sachin", "Sachin"); // fial 
		
		//Assert.assertNotEquals(125, 125); // fail
		//Assert.assertNotEquals("567", 567); // pass
		
		//Assert.assertTrue(false); // fail
		//Assert.assertTrue(true); // pass
		
		//Assert.assertTrue(1==1); // pass
		//Assert.assertTrue(1==2); // failed
		
		//Assert.assertFalse(5==6); // passed
		//Assert.assertFalse(6==6); // failed
		
	    // expecting false from(6==6) true so its failed
		
		// without condition or Assertion we can still fail the Test Method  using fail()
		
		Assert.fail(); // result will be failed
		 
	}
}

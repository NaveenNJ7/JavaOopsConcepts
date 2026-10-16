package PracticeAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeSoftAssertions {

/*
	 Soft Assertion -> All methods in SoftAssertion are non static 
	 so we can access through object of SoftAssertion
	 if test method fail or pass the statements below the soft assertion condition 
	 still execute 
*/
//	@Test
	public void testTitle()
	{
		String act_title="Java";
		String exp_title="java";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(act_title, exp_title); // failed
		System.out.println("Statements executed");
/*
	here condition is failed but result will be Passed, so in order to over come this
	we need use sa.assertAll() at the end, the SoftAssert will give actual result	 
*/
	}
	
	@Test
	public void testHeading()
	{
		String a = "Java";
		String b = "Python";
		SoftAssert st = new SoftAssert();
		st.assertEquals(a, b);
		System.out.println("Statements executed");
		st.assertAll();
	}
}

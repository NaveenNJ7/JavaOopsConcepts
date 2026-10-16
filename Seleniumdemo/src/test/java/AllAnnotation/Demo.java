package AllAnnotation;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class Demo {

	@BeforeSuite
	void BS()
	{
		System.out.println("Before suit");
	}
	@AfterSuite
	void AS()
	{
		System.out.println("After suit");
	}
	
	@BeforeTest
	void BT()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("After test");
	}
	
	@BeforeClass
	void BC()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	void AC()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	void BM()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	void AM()
	{
		System.out.println("After method");
	}
	
	@Test(priority=1)
	void TS()
	{
		System.out.println("Test 1");
	}
	
	@Test(priority=2)
	void TS1()
	{
		System.out.println("Test 2");
	}
	
	
}

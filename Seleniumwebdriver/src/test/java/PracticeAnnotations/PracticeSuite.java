package PracticeAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeSuite {

	@BeforeSuite
	public void suite1()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void suite2()
	{
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void test1()
	{
		System.out.println("Before test");
	}
	
	@AfterTest
	public void test2()
	{
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void method2()
	{
		System.out.println("After method");
	}
	
	@Test(priority=1)
	public void search()
	{
		System.out.println("Search test");
	}
	
	@Test(priority=2)
	public void advancesearch()
	{
		System.out.println("Advancesearch test");
	}
	
	@BeforeClass
	public void class1()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void class2()
	{
		System.out.println("After class");
	}
	
}

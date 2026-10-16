package PracticeListenerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerCl implements ITestListener {

	/*
	this one we have to write in xml
	
	<suite name="Suite">

		<listeners>
			<listener class-name="PracticeListenerClass.ListenerCl"/>
		</listeners>
 
  <test thread-count="5" name="Test">
    <classes>
      <class name="PracticeListenerClass.PracticeListener"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 
	 
	 
	*/
	public void onStart(ITestContext context) {
	    System.out.println("Test Execution started");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test started");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("Test success");
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test failure");
	  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}
	
	public void onFinish(ITestContext context) {
	    System.out.println("Test Execution finish");
	  }
}

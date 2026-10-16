package PracticeListenerClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter SparkReporter; // ui of the report
	public ExtentReports extent; // info of report
	public ExtentTest test; //status of test method
	
	
	public void onStart(ITestContext context) {
	    SparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\myreport.html");
	    SparkReporter.config().setDocumentTitle("Automation");
	    SparkReporter.config().setReportName("Functional testing");
	    SparkReporter.config().setTheme(Theme.DARK);
	    
	    extent = new ExtentReports();
	    extent.attachReporter(SparkReporter);
	    
	    extent.setSystemInfo("Computer name", "Localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester", "Naveen");
	    extent.setSystemInfo("os", "Windows");
	    extent.setSystemInfo("browsers", "chrome");
	    
	  }

	
	public void onTestSuccess(ITestResult result) {
	    test = extent.createTest(result.getName()); //create new entry in report
	    test.log(Status.PASS, "Test case passed is :"+result.getName()); // update status pass/fail/skip
	  }
	
	public void onTestFailure(ITestResult result) {
	    test  =extent.createTest(result.getName());
	    test.log(Status.FAIL, "Test case failed is :"+result.getName());
	    test.log(Status.FAIL, "Test case failed cause :"+result.getThrowable());
	  }
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is skipped :"+result.getName());
	}
	
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }
	
	
}

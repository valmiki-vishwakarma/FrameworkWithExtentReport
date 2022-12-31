package rough;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReportUtils {
	
	@Test
	public void report() {
		ExtentReports extent = new ExtentReports();
		//ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
		ExtentSparkReporter spark = new ExtentSparkReporter("spark/spark.html");
				 
		
		extent.attachReporter(spark);
		extent.createTest("MyFirstTest")
		  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
		extent.flush();
		
	}

}

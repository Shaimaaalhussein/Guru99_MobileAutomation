package Utilities;


import java.io.IOException;

import org.testng.annotations.*;
import com.relevantcodes.extentreports.*;


public class ExtentsReportUtil {
	

		public static ExtentReports extent;
		public static ExtentTest test;

		
		
		@BeforeSuite
		public static void report() throws InterruptedException, IOException {

			// String report_path=System.getProperty("user.dir")+"/Reports/"+reportname+".html");
			// extent = new ExtentReports(report_path);
			//String reportname
			//extent = new ExtentReports(System.getProperty("user.dir") + "/Reports/" + reportname + ".html");										
			 extent = new ExtentReports(System.getProperty("user.dir") +"//Report//TestResult.html");
		
		}
		

		@AfterSuite
		public void Endreport() throws InterruptedException, IOException {
			extent.flush();
			extent.close();
		}

	}



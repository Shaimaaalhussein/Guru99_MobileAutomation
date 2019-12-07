package Tests;
import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.*;
import Utilities.*;

public class SapCateogry extends Testbase{

	
 @Test
	public void sapCourse() throws InterruptedException, IOException
	{
	 try {

	ExtentsReportUtil.test = ExtentsReportUtil.extent.startTest("sapCourse");
	 Thread.sleep(7000);
	 //HomeCourseCateogryUtil.Home();
	 HomeCourseCateogryUtil.Coursecateogry();
	 HomeCourseCateogryUtil.SAP();
	 Assert.assertEquals(true, true);
	 ScreenShotUtil.screenShot("sapCourse");
	 String testname="sapCourse TC Passed";
		ScreenShotUtil.screenShot(testname);
		ExtentsReportUtil.test.log(LogStatus.PASS,testname +ExtentsReportUtil.test.addScreenCapture(System.getProperty("user.dir")+"//Screenshot//"+testname+".png"));
		
		} catch (Exception e) {

			//ExtentsReportUtil.test.log(LogStatus.FAIL, "sapCourse TC Failed ");
			String testname="sapCourse TC Failed";
			ScreenShotUtil.screenShot("testname");
			ExtentsReportUtil.test.log(LogStatus.FAIL, "sapCourse TC Failed "+ExtentsReportUtil.test.addScreenCapture(System.getProperty("user.dir")+"//Screenshot//"+testname+".png"));
			
			e.printStackTrace();
		}
	 
	 ExtentsReportUtil.extent.endTest(ExtentsReportUtil.test);

	}
	 
	}
			



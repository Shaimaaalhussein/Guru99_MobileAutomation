package Utilities;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Tests.Testbase;

public class ScreenShotUtil extends Testbase {
	public static void screenShot(String testname) throws IOException
	{
		 
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		 FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshot//"+testname+".png"));
	}
}

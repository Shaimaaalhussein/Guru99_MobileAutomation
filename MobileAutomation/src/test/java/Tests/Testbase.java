package Tests;


import io.appium.java_client.android.AndroidDriver;
import Configuration.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class Testbase {
	public static AndroidDriver driver;
	@BeforeTest
	public void Capabilities() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
	 	// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

		capabilities.setCapability("deviceName", MainCapabilities.deviceName);
		capabilities.setCapability("VERSION", MainCapabilities.VERSION);

		// Set android platformName desired capability. It's Android in our case here.
		//capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("platformName",MainCapabilities.platform );
		capabilities.setCapability("app",MainCapabilities.app);
		capabilities.setCapability("appPackage",MainCapabilities.appPackage);
		capabilities.setCapability("appActivity",MainCapabilities.appActivity);
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
	}

}

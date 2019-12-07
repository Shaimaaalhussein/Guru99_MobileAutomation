package PageObjects;

import io.appium.java_client.android.AndroidDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeCourseCateogory {
	public HomeCourseCateogory()
	{}
	public static WebElement getHome(AndroidDriver driver)
	{
		return driver.findElement(By.id("android:id/action_bar_title"));
	}
	public static WebElement getCoursecateogry(AndroidDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='Course Category']"));
	}
	public static WebElement getSAP(AndroidDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='SAP']"));
	}
	public static WebElement getService_OS(AndroidDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='Server & OS']"));
	}
	

}

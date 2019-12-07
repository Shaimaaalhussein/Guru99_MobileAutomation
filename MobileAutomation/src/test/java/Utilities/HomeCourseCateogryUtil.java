package Utilities;
import PageObjects.*;
import Tests.*;

public class HomeCourseCateogryUtil extends Testbase {
	public HomeCourseCateogryUtil()
	{}
	
	public static void Home()
	{
		HomeCourseCateogory.getHome(driver).click();
	}
	public static void Coursecateogry()
	{
		HomeCourseCateogory.getCoursecateogry(driver).click();
	}
	public static void SAP()
	{
		HomeCourseCateogory.getSAP(driver).click();
	}
	public static void Server_OS()
	{
		HomeCourseCateogory.getService_OS(driver).click();
	}

}

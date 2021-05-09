package TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ExtentReports.GenerateExtentReport;
import Pages.ReusableMethods;
import junit.framework.Assert;

public class Test1 {
	ReusableMethods reusable = new ReusableMethods();

	@BeforeSuite
	public void setExtent() {
		GenerateExtentReport.setExtent();
	}

	@AfterSuite
	public void endExtend() {
		GenerateExtentReport.endExtent();
	}

	@Test(priority = 1)
	public void openBrowser() {

		reusable.navigateToLogInPage("chrome");
		System.out.println("Appllication is Open Successfull");
	}

	@Test(priority = 2)
	public void logIn() {
		Assert.assertEquals("Samrat", "Samrat");
		System.out.println("logged In Successfull");
	}

	@Test(priority = 3)
	public void logOut() {
		Assert.assertEquals("Mogal", "Samrat");
		System.out.println("loged Out Successfull");
	}

	@Test(priority = 4)
	public void Quite() {
		System.out.println("Quite Driver Successfull");
		reusable.quiteDriver();	
		String str = "";
		if (str.isBlank()) {
			throw new SkipException("Skipping this exception");
		}
		
	}

}

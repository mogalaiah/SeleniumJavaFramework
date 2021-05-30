package TestNGListeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ExtentReports.GenerateExtentReport;
import Pages.ReusableMethods;

public class TestNGAnnotation {
	
	ReusableMethods reusable = new ReusableMethods();
	
	@BeforeSuite
	public void setExtent() {
		GenerateExtentReport.setExtent();
	}

	@AfterSuite
	public void endExtend() {
		GenerateExtentReport.endExtent();
		reusable.quiteDriver();
	}

	@BeforeMethod
	public void intiateBrowser() {
		reusable.incilizeBrowser("chrome");
	}

	@AfterMethod
	public void closeBowser() {
		reusable.closeBrowser();
	}

}

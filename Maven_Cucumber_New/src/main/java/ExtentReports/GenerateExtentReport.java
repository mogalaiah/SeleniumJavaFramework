/*package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenerateExtentReport {
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static ExtentHtmlReporter reporter;

	public static void setExtent() {
		reporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "/MyReort/" + "MyOwnReport_" + System.currentTimeMillis() + ".html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name: ", "localhost");
		extent.setSystemInfo("Environment: ", "Dev");
		extent.setSystemInfo("User Name: ", "Mogalaiah");
	}

	public static void endExtent() {
		extent.flush();
	}

	public static String getScreenshot(WebDriver driver) {
		TakesScreenshot fi = (TakesScreenshot) driver;
		File screenShot = fi.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(screenShot, destination);
		} catch (Exception e) {
			System.out.println("Error Message" + e.getMessage());
		}
		return path;

	}

}*/

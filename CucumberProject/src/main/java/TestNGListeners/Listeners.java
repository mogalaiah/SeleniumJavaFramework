package TestNGListeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import ExtentReports.GenerateExtentReport;
import Pages.ReusableMethods;


public class Listeners extends GenerateExtentReport implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Execution Started Successfully");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger = extent.createTest(result.getName());
		if (result.getStatus() == ITestResult.SUCCESS) {
			String path = GenerateExtentReport.getScreenshot(ReusableMethods.driver);
			try {
				logger.pass("Assert pass as condition is true",
						MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger = extent.createTest(result.getName());
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = GenerateExtentReport.getScreenshot(ReusableMethods.driver);
			try {
				logger.fail("Assert fail as condition is false",
						MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger = extent.createTest(result.getName());
		if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, "Test Case is Skipe" + result.getName() + "" + result.getTestName());
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		logger = extent.createTest(result.getName());
		if (result.getStatus() == ITestResult.FAILURE) {
			String path = GenerateExtentReport.getScreenshot(ReusableMethods.driver);
			try {
				logger.fail("Test Case is Failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		extent.flush();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish Test");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

}

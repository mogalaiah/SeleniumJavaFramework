
package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Logs.LogClass;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		LogClass.logger.info(
				"**************************************Execution Started Successfully: ***********************************"
						+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			LogClass.logger.info("Scenario Is Passed Successfully: " + result.getName());
			LogClass.logger.info(
					"**************************************Test Scenarios Completed Successfully: **************************************"
							+ result.getName());

		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			LogClass.logger.info("Scenario Is Failed Due To: " + result.getName());
			LogClass.logger.info(
					"**************************************Test Scenarios Not Completed Successfully: **************************************"
							+ result.getName());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			LogClass.logger.info("Scenario Is Skepped Successfully: " + result.getName());
			LogClass.logger.info(
					"**************************************Test Scenarios Skepped Successfully: **************************************"
							+ result.getName());
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			LogClass.logger.info("Scenario Is Failed Due To: " + result.getName());
			LogClass.logger.info(
					"**************************************Test Scenarios Not Completed Successfully: **************************************"
							+ result.getName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		LogClass.logger.info(
				"**************************************Finish Test Scenarios Successfully: **************************************"
						+ context.getName());
	}

	@Override
	public void onStart(ITestContext context) { // TODO Auto-generated

	}

}

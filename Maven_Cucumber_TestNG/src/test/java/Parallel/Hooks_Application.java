package Parallel;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Feature;

import Logs.LogClass;
import Utility.ConfigReader;
import Utility.DriverFactory;
import io.cucumber.java.*;
import io.cucumber.plugin.event.StepDefinition;
import tech.grasshopper.pdf.section.feature.FeatureDisplay;

public class Hooks_Application {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProerty() {
		configReader = new ConfigReader();
		prop = configReader.int_property();
	}

	@Before(order = 1)
	public void lauchBrowser() throws MalformedURLException {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.incilizeBrowser(browserName);
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
		LogClass.logger.info("Browser Is Quite Successfully");
	}

	@BeforeStep(order = 0)
	public void takeScreenshot(Scenario scenario) {
		String scenarioName = scenario.getName().replace(" ", "_");
		byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcepath, "image/png", scenarioName);
	}

}

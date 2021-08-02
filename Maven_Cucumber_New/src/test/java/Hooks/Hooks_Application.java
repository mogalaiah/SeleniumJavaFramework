package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utility.ConfigReader;
import Utility.DriverFactory;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.*;


public class Hooks_Application {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getProerty() {
		configReader = new ConfigReader();
		prop= configReader.int_property();		
	}
	
	@Before(order=1)
	public void lauchBrowser() {
		String browserName= prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver=driverFactory.incilizeBrowser(browserName);
	}
	

	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void takeScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			String scenarioName = scenario.getName().replace(" ", "_");
			byte[] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);	
			scenario.attach(sourcepath, "image/png", scenarioName);
			System.out.println(scenarioName);
		}
		
	}

}

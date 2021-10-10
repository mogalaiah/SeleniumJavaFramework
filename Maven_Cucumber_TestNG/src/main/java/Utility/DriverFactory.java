package Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import Logs.LogClass;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	Logger log = Logger.getLogger(DriverFactory.class);

	public WebDriver incilizeBrowser(String browser) throws MalformedURLException {
		if (browser.equals("chrome")) {
			// DesiredCapabilities dc= DesiredCapabilities.chrome();
			// URL url= new URL("http://localhost:4444/wd/hub");
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			LogClass.logger.info("chrome Browser Is Lunched: ");
			// tlDriver.set(new RemoteWebDriver(url,dc));
		} else if (browser.equals("firefox")) {
			DesiredCapabilities dc= DesiredCapabilities.firefox();
			URL url= new URL("http://localhost:4444/wd/hub");
			//WebDriverManager.firefoxdriver().setup();
			//tlDriver.set(new FirefoxDriver());
			tlDriver.set(new RemoteWebDriver(url, dc));
			LogClass.logger.info("Firefox Browser Is Lunched: ");
		} else if (browser.equals("opera")) {
			DesiredCapabilities dc= DesiredCapabilities.opera();
			URL url= new URL("http://localhost:4444/wd/hub");
		//	WebDriverManager.iedriver().setup();
		//	tlDriver.set(new InternetExplorerDriver());
			tlDriver.set(new RemoteWebDriver(url,dc));
			LogClass.logger.info("Opera Browser Is Lunched: ");
		} else {
			LogClass.logger.info("Invalid Browser Is Lunched: "+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		LogClass.logger.info("Browser Is Opened");
		return tlDriver.get();
	}

}

package Utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver incilizeBrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/EclipsWorkSpace/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:/EclipsWorkSpace/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Please Pass the correct driver value: "+browser);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}

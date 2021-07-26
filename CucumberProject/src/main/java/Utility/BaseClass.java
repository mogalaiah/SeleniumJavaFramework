package Utility;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	public static WebDriver driver=null;
	public static final Logger log  = Logger.getLogger(BaseClass.class);

	@Before
	public void incilizeBrowser() {
		String log4j = System.getProperty("user.dir")+"//src//main//java//Log4j//log4j.properties";
		PropertyConfigurator.configure(log4j);
		System.setProperty("webdriver.chrome.driver", "D:/EclipsWorkSpace/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Chrome driver was maximized successfully");
	
	}
	@After
	public void quiteDriver() {
		driver.quit();
	}

}

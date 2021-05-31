package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	public static WebDriver driver=null;
	public static Logger logger;
	@Before
	public void navigateToURL() {
		System.setProperty("webdriver.chrome.driver", "D:/EclipsWorkSpace/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		logger.info("Opened Browser Successfully with Current URL");	
		
	}
	
	
	@After
	public void quiteDriver() {
		driver.quit();
	}

}

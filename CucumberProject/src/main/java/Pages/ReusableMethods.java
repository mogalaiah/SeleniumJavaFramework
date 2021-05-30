package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import ExtentReports.GenerateExtentReport;


public class ReusableMethods {
	public static WebDriver driver;
	
	public void incilizeBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/EclipsWorkSpace/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "D:/EclipsWorkSpace/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Mazilla")) {
			System.setProperty("webdriver.gecko.driver", "D:/EclipsWorkSpace/drivers/geckodriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("marionette",true);
			driver= new FirefoxDriver(capabilities);
		}
		else {
			System.out.println("Browser Driver Is Not Yet Incilized");
		}
	}

	public void navigateToLogInPage(String URL) {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		if (!driver.getTitle().isEmpty()) {
			System.out.println("Login page is Displayed");
			Assert.assertTrue(true);
		} else {
			System.out.println("Login Page is not Displayed");
			Assert.assertTrue(false);
		}
	}

	public void verifyHomePage(String Expected ) {
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().trim().equals(("Master Page").trim())) {
			String Actuals = driver.getTitle();
			Assert.assertEquals(Actuals, Expected);
			System.out.println("Home page is Displayed");
		} else {
			System.out.println("Home Page is not Displayed");
		}
	}

	public void patientRegistration(String RegistrionType) throws Exception {
		driver.findElement(By.linkText("Registration")).click();

		if (RegistrionType.equalsIgnoreCase("PermanentRegistration")) {
			// Basic Details

			driver.findElement(By.linkText("Permanent Registration")).click();
			new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Pay Patient");
			new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
			driver.findElement(By.name("PNT_NAME")).sendKeys("Samrat");
			driver.findElement(By.name("LAST_NAME")).sendKeys("Mogal");
			driver.findElement(By.name("DOB")).sendKeys("18-11-1992");
			driver.findElement(By.name("AGE")).sendKeys("28");
			driver.findElement(By.name("DOB")).sendKeys("18-11-1992");
			new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
			new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
			new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
			new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("English");
			new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
			new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
			driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("BHNPG7988X");
			new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
			new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
			new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
			new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
			new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
			new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
			new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");

			// Upload Photo
			driver.findElement(By.name("image")).sendKeys("C:\\Users\\Mogalaiah Gannepaka\\Desktop\\phote1.JPG");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// Permanent Address
			driver.findElement(By.name("ADDRESS1")).sendKeys("HNO: 4-57, SC-Colony");
			driver.findElement(By.name("MOBILE_NO")).sendKeys("1236020946");
			driver.findElement(By.name("EMAIL_ID")).sendKeys("xyz@gmail.com");
			new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");

			// Current Address
			driver.findElement(By.name("ADDRESS2")).sendKeys("HNO: 4-57, SC-Colony, Hyderabad");
			driver.findElement(By.name("ZIP")).sendKeys("508202");
			driver.findElement(By.name("submit")).click();
		} else if (RegistrionType.equalsIgnoreCase("EmergencyRegistration")) {

			driver.findElement(By.linkText("Emergency Registration")).click();
			new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Pay Patient");
			new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
			driver.findElement(By.name("PNT_NAME")).sendKeys("Samrat");
			driver.findElement(By.name("AGE")).sendKeys("28");
			new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
			driver.findElement(By.name("submit")).click();
		} else {
			System.out.println("Registration Type is invalid");
		}
	}

	public String getRegistrationNumber() throws Exception {
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		driver.switchTo().alert().accept();
		String RegisrtationNum = alertMessage.substring(alertMessage.length() - 1 - 12, (alertMessage.length() - 1));
		return RegisrtationNum;

	}
	
	public void logoutFromApplication() {
		driver.findElement(By.linkText("Logout")).click();
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Chrome Browser is closed");
	}

	public void quiteDriver() {
		driver.quit();
		System.out.println("Driver is Quited");
	}
	
	public void navigateToBackHomePage() {
		driver.navigate().back();
		driver.navigate().back();
	}

}

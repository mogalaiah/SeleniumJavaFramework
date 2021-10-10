package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BaseClass {
	
	public void AssetEquals(String Actual, String Expected) {
		if (Actual.equals(Expected)) {
			Assert.assertEquals(Actual, Expected);
		}

	}

	public void highlightWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='5px solid blue'", element);
	}
}

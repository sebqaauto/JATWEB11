package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirtAutoTest {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1) WebDriver library 
		 * 2) Browser Drivers
		 * 3) Real Browsers
		 */
		
		// Before Selenium Manager - the driver files should be downloaded and the path of it should be set
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver2 = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		
		/*
		 * ID
		 * Class Name
		 * Name
		 * TagName
		 * LinkText
		 * PartialLinkText
		 * Css selector
		 * Xpath  -- //tagName[@attributeName ='attribute-value']
		 * //tagName[text()='text-value']
		 * 
		 */
		
	}

}

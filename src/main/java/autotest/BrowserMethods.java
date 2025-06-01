package autotest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {
	
	//Declaring the driver
	WebDriver driver;
	String url = "https://www.facebook.com/";
	String secondUrl = "https://www.facebook.com/r.php?entry_point=login";
	String currentUrl;
	String title;
	Dimension target;
	
	public void setMobileView() {
		target = new Dimension(430, 932);
	}
	
	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	public void launchFirefoxBrowser() {
		driver = new FirefoxDriver();
	}
	public void launchApp() {
		driver.get(url);
		//driver.manage().window().maximize();
		driver.manage().window().setSize(target);
	}
	
	public void testBrowserMethods() throws InterruptedException {
		currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is -- "+currentUrl);
		title = driver.getTitle();
		System.out.println("The current title is -- "+title);
		//String pageSource = driver.getPageSource();
		//System.out.println("The page source is "+pageSource);
		//Navigate to the Second Url 
		driver.navigate().to(secondUrl);
		currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is -- "+currentUrl);
		title = driver.getTitle();
		System.out.println("The current title is -- "+title);
		//Thread.sleep(5000);
		//driver.close();// When there is only one tab after close you can't launch again 
		//driver.quit();// It closes/kill the driver instance itself 
		//driver.get(currentUrl);
		
	}
	
	public void browserNavigation() {
		//Navigating in the browser 
		driver.navigate().back();
		currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is -- "+currentUrl);
		title = driver.getTitle();
		System.out.println("The current title is -- "+title);
		
		driver.navigate().forward();
		currentUrl = driver.getCurrentUrl();
		System.out.println("The current url is -- "+currentUrl);
		title = driver.getTitle();
		System.out.println("The current title is -- "+title);
		
		driver.navigate().refresh();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
	
		BrowserMethods runTest = new BrowserMethods();
		runTest.launchChromeBrowser();
		runTest.setMobileView();
		runTest.launchApp();
		runTest.testBrowserMethods();
		runTest.browserNavigation();
		
		
	}

}

package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	WebDriver driver;
	String url = "https://artoftesting.com/samplesiteforselenium";
	

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
		driver.manage().window().maximize();
		//driver.manage().window().setSize(target);
	}
	
	public void handleCookie() {
		
		List<WebElement> cookie = driver.findElements(By.cssSelector("button[mode='primary']"));
		if(cookie.size()>0) {
			cookie.get(0).click();
		}
		
	}
	
	public void mouseActions() {
	WebElement source =driver.findElement(By.id("myImage"));
	WebElement target = driver.findElement(By.id("targetDiv"));
	Actions action = new Actions(driver);
	action.dragAndDrop(source, target).build().perform();
	}

	public static void main(String[] args) {
		MouseActions mouse = new MouseActions();
		mouse.launchChromeBrowser();
		mouse.launchApp();
		mouse.handleCookie();
		mouse.mouseActions();

	}

}

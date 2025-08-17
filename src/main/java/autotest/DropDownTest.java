package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().window().setSize(target);
	}
	
	public void handleCookie() {
		
		List<WebElement> cookie = driver.findElements(By.cssSelector("button[mode='primary']"));
		if(cookie.size()>0) {
			cookie.get(0).click();
			System.out.println("Cookie was found");
		}else {
			System.out.println("Cookie was not found");
		}
		
	}
	
	public void handleDropDown() throws InterruptedException {
		WebElement element = driver.findElement(By.id("testingDropdown"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Manual Testing");
		//Thread.sleep(Duration.ofSeconds(2));
		dropdown.selectByIndex(1);
		//Thread.sleep(Duration.ofSeconds(2));
		dropdown.selectByValue("Database");
	}
	public static void main(String[] args) throws InterruptedException {
		
		DropDownTest dd = new DropDownTest();
		dd.launchChromeBrowser();
		dd.launchApp();
		dd.handleCookie();
		dd.handleDropDown();
	}

}

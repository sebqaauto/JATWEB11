package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {
	
	//Declaring the driver
		WebDriver driver;
		String url = "https://www.facebook.com/";
		String secondUrl = "https://www.facebook.com/r.php?entry_point=login";
		String currentUrl;
		String title;
		Dimension target;
		Boolean elementState;
		
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
			driver.manage().window().maximize();
			//driver.manage().window().setSize(target);
		}
		
		public void acceptCookies() {
			driver.findElement(By.xpath("//div[@tabindex='0']//span[text()='Allow all cookies']")).click();
		}
		
		public void webElementInteractions() {
			/*
			 * 1) Find the unique location of the element - findElement() & findElements()
			 * 2) Interact with the element 
			 */
			WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
			elementState = createAccountButton.isDisplayed();
			System.out.println("The createAccountButton is displayed == "+elementState);
			elementState = createAccountButton.isEnabled();
			System.out.println("The createAccountButton is enabled == "+elementState);
			if(elementState) {
				createAccountButton.click();
			}
			currentUrl = driver.getCurrentUrl();
			System.out.println("The current url is -- "+currentUrl);
			title = driver.getTitle();
			System.out.println("The current title is -- "+title);
		}
	

	public static void main(String[] args) {
		
		WebElementMethods test = new WebElementMethods();
		test.launchChromeBrowser();
		test.launchApp();
		test.acceptCookies();
		test.webElementInteractions();
	}

}

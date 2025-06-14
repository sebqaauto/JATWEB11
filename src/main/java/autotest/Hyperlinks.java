package autotest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlinks {
	
	/*
	 * Find the number of hyper links in the FB page
	 * From the hyper links navigate to the 3rd hyperlink 
	 * From the hyper links navigate to the last hyperlink 
	 * Solution:
	 * 1) Launch the browser and navigate to the url 
	 * 2) Using the tag name which has <a> find all the matching elements - findElements()
	 * 3) Store the matching elements inside List<WebElement> object
	 * 4) object.get(3) => retrieves the 3rd 
	 * 5) How to get the value of href ='' => getAttribute(href) => it returns the href value as a string 
	 * 6) String link = ''
	 * 7) driver.navigate().to(link)
	 */
	
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
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

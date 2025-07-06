package autotest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowTest {
	
	String url = "https://www.amazon.in/";

	//Declaring the driver
	WebDriver driver;
	//String secondUrl = "https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_1_sspa?crid=MPGNIXMFM60C&dib=eyJ2IjoiMSJ9.aFg8Oc85a5Ac6KtlRxUXZ3GQxxPXCtHZ0zOXqgAIeGoYxc61NR9Qh-S3XchUD4-Cg95rduFiGqDkp2tSyqgWsRSeb9UI_aokK4uQjIsYuFkOw6c5nWga0kkVCKi6Pmf_tgZxl3glqyUMAV22a9VJKpJKUfSSvap1NrE59Q0LADTpefXhZhpc6mP7r_-hhpAQ5-r_uBc6Krpgk7i3TP400FFLiFvZ-U5wM_-AQl2o29Y.j4iDYND8ER9XpVA3hm4VOUeUv1vklkx8C4NVkXvtcwo&dib_tag=se&keywords=iphone&qid=1750511048&sprefix=iphone%2Caps%2C106&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1";
	String currentUrl, parentWindow, childWindow, flipKartWindow;
	String title;
	Set<String> windowHandles;
	
	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}

	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
		parentWindow = driver.getWindowHandle();
	}
	
	public void openNewTab() {
		String refUrl = driver.findElement(By.cssSelector("div#nav-link-accountList>a")).getAttribute("href");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get(refUrl);
		childWindow = driver.getWindowHandle();
	}
	
	public void openFlipKart() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		flipKartWindow = driver.getWindowHandle();
	}
	
	public void switchWindow(String window) {
		driver.switchTo().window(window);//Selenium treats each window/tab as a window 
		title = driver.getTitle();
		System.out.println(title);
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public void closeWindow() {
		driver.close();
		// driver will always look for the default HTML DOM 
		// It should be switched to a window to shift its focus even after close
	}
	
	public void getTitelAndUrl() {
		title = driver.getTitle();
		System.out.println(title);
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void main(String[] args) {
		NewWindowTest test = new NewWindowTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.openNewTab();
		test.openFlipKart();
		test.switchWindow(test.parentWindow);
		test.switchWindow(test.childWindow);
		test.switchWindow(test.flipKartWindow);
		test.closeWindow();
		test.switchWindow(test.parentWindow);
		test.getTitelAndUrl();

	}

}

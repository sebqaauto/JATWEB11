package autotest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesTest {

	String url = "https://demoqa.com/browser-windows";

	//Declaring the driver
	WebDriver driver;
	//String secondUrl = "https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_1_sspa?crid=MPGNIXMFM60C&dib=eyJ2IjoiMSJ9.aFg8Oc85a5Ac6KtlRxUXZ3GQxxPXCtHZ0zOXqgAIeGoYxc61NR9Qh-S3XchUD4-Cg95rduFiGqDkp2tSyqgWsRSeb9UI_aokK4uQjIsYuFkOw6c5nWga0kkVCKi6Pmf_tgZxl3glqyUMAV22a9VJKpJKUfSSvap1NrE59Q0LADTpefXhZhpc6mP7r_-hhpAQ5-r_uBc6Krpgk7i3TP400FFLiFvZ-U5wM_-AQl2o29Y.j4iDYND8ER9XpVA3hm4VOUeUv1vklkx8C4NVkXvtcwo&dib_tag=se&keywords=iphone&qid=1750511048&sprefix=iphone%2Caps%2C106&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1";
	String currentUrl, parentWindow, childWindow;
	String title;
	Set<String> windowHandles;
	Dimension target;
	
	public void setMobileView() {
		target = new Dimension(430, 932);
	}
	
	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	public void handlePrivacy() {
		List<WebElement> privacy = driver.findElements(By.xpath("//div[text()='Reject all']"));
		if(privacy.size()>0) {
			privacy.get(0).click();
		}
	}
	public void launchFirefoxBrowser() {
		driver = new FirefoxDriver();
	}
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void openNewTab() {
		parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		// After a new Tab is opened, the driver is still in the context of the current tab
		title = driver.getTitle();
		System.out.println(title);
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("The parentWindow -- "+parentWindow);
	}
	
	public void getAllWindowHandles() {
		windowHandles = driver.getWindowHandles();
		//windowHandles contains parentWindow & newWindow
		for (String handle : windowHandles) {
			if(!handle.equals(parentWindow)) {
				childWindow  = handle;
			}
		}
		System.out.println("The childWindow -- "+childWindow);
	}
	
	public void switchWindow(String window) {
		driver.switchTo().window(window);
		title = driver.getTitle();
		System.out.println(title);
		currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public void newTabFeature() {
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		WindowHandlesTest test = new WindowHandlesTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.openNewTab();
		test.getAllWindowHandles();
		test.switchWindow(test.childWindow);
		test.newTabFeature();
		test.switchWindow(test.parentWindow);

	}

}

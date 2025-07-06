package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	String url = "https://www.hyrtutorials.com/p/frames-practice.html";

	//Declaring the driver
	WebDriver driver;

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	public void handlePrivacy() {
		List<WebElement> privacy = driver.findElements(By.cssSelector("button[aria-label='Do not consent']>p"));
		if(privacy.size()>0) {
			privacy.get(0).click();
		}
	}
	
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	String text;
	public void interact() {
		//find the iframe and switch to it 
		driver.switchTo().frame("frm2");
		driver.findElement(By.cssSelector("div[class='basicControls']>input#firstName")).sendKeys("TEST @ TEST");
		text = driver.findElement(By.cssSelector("div.post-head>h1.entry-title")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		text = driver.findElement(By.cssSelector("div.post-head>h1.entry-title")).getText();
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		
		FrameTest test = new FrameTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.handlePrivacy();
		test.interact();
	}
	
	/* NoSuchElementException
	 * 1) WebElement locator is incorrect 
	 * 2) It could be part of the iframe 
	 */

}

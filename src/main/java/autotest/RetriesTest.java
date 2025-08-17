package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetriesTest {

	String url = "https://www.hyrtutorials.com/p/waits-demo.html";

	//Declaring the driver
	WebDriver driver;

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	public void handlePrivacy() {
		List<WebElement> privacy = driver.findElements(By.xpath("//p[text()='Do not consent']"));
		if(privacy.size()>0) {
			privacy.get(0).click();
		}
	}
	long startTime, endTime;
	WebDriverWait wait;
	FluentWait<WebDriver> fluentWait;
	public void launchApp() {
		startTime = System.currentTimeMillis();
		driver.get(url);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken for driver.get() to complete" + (endTime - startTime));
		driver.manage().window().maximize();
		//Implicit Wait is a Global Wait - it applies all the elements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		//Explicit Wait 
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Fluent Wait 
		fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(Exception.class);
	}
	
	public void handleTextBox() {
		driver.findElement(By.id("btn1")).click();
		endTime = System.currentTimeMillis();
		System.out.println("The time taken for first element interaction "+(endTime-startTime));
		startTime = System.currentTimeMillis();
		driver.findElement(By.cssSelector("div.post-body input#txt1")).sendKeys("Test Test");
		endTime = System.currentTimeMillis();
		System.out.println("The time taken for Second element interaction "+(endTime-startTime));
		}
	
	public void handleTextBox2() {
		driver.findElement(By.id("btn2")).click();
		endTime = System.currentTimeMillis();
		System.out.println("The time taken for first element interaction "+(endTime-startTime));
		startTime = System.currentTimeMillis();
		//Retry mechanism
//		for(int i=1; i<=3; i++) {
//			try {
//				driver.findElement(By.cssSelector("div.post-body input#txt2")).sendKeys("Test Test");
//			}catch(Exception e) {
//				System.out.println("For the -- "+i+ "th time from the exception block -- "+ e);
//			}
//			
//		}
		//WebElement element = driver.findElement(By.cssSelector("div.post-body input#txt2"));
		By locator = By.cssSelector("div.post-body input#txt2");
		retrySendKeys(locator, 3, "retry text");
		
		endTime = System.currentTimeMillis();
		System.out.println("The time taken for Second element interaction "+(endTime-startTime));
	}
	
	public void retrySendKeys(By locator, int retriesCount, String sendKeysText) {
		for(int i=1; i<=retriesCount; i++) {
			try {
				driver.findElement(locator).sendKeys(sendKeysText);
			}catch(Exception e) {
				System.out.println("For the -- "+i+ "th time from the exception block -- "+ e);
			}
		}
	}
	
	
	public static void main(String[] args) {
		RetriesTest test = new RetriesTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.handlePrivacy();
		test.handleTextBox();
		test.handleTextBox2();
		

	}

}


	
package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTest2 {

	WebDriver driver;
	String url = "https://demowebshop.tricentis.com/";
	

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
	public void intractWithCarousel() {
		WebElement link = driver.findElement(By.xpath("//a[@href='https://academy.tricentis.com' and @style='display: block;']/img"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(link));//[@href='https://academy.tricentis.com' and 
//		List<WebElement> next = driver.findElements(By.cssSelector("div.nivo-controlNav>a"));
//		for (WebElement webElement : next) {
//			webElement.click();
			try {
				FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(20))
						.pollingEvery(Duration.ofMillis(100))
						.ignoring(Exception.class);
				WebElement link2 = fWait.
				until(ExpectedConditions
				.presenceOfElementLocated(
				By.xpath("//a[@href='https://academy.tricentis.com' and @style='display: block;']")));
				link2.click();	
			}catch(Exception e) {
				System.out.println("Exception was thrown -- "+ e);
			}
			
		//}
		
	}
	
	
	
	public static void main(String[] args) {
		
		DemoTest2 test = new DemoTest2();
		test.launchFirefoxBrowser();
		test.launchApp();
		test.intractWithCarousel();
	}

}

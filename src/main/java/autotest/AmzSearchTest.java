package autotest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmzSearchTest {

	String url = "https://www.amazon.in/ref=nav_logo";

	//Declaring the driver
	WebDriver driver;
	String secondUrl = "https://www.amazon.in/Apple-iPhone-15-128-GB/dp/B0CHX1W1XY/ref=sr_1_1_sspa?crid=MPGNIXMFM60C&dib=eyJ2IjoiMSJ9.aFg8Oc85a5Ac6KtlRxUXZ3GQxxPXCtHZ0zOXqgAIeGoYxc61NR9Qh-S3XchUD4-Cg95rduFiGqDkp2tSyqgWsRSeb9UI_aokK4uQjIsYuFkOw6c5nWga0kkVCKi6Pmf_tgZxl3glqyUMAV22a9VJKpJKUfSSvap1NrE59Q0LADTpefXhZhpc6mP7r_-hhpAQ5-r_uBc6Krpgk7i3TP400FFLiFvZ-U5wM_-AQl2o29Y.j4iDYND8ER9XpVA3hm4VOUeUv1vklkx8C4NVkXvtcwo&dib_tag=se&keywords=iphone&qid=1750511048&sprefix=iphone%2Caps%2C106&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1";
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
		driver.get(secondUrl);
		driver.manage().window().maximize();
	}
	String searchText ="samsung";
	String xpathString ="Samsung";
	public void searchAndFindFirstProduct() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchText);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//div[@data-cel-widget='search_result_2']//div[contains(@class,'s-image-fixed-height')]/child::img")).click();
		driver.findElement(By.xpath("//span[@data-component-type='s-search-results']//div[@role='listitem'][1]//span[contains(text(),'"+xpathString+"')]")).click();	
	}
	
	public void scrollTo() throws InterruptedException {
	WebElement element = driver.findElement(By.id("similarities-product-bundle-widget-title"));
	Thread.sleep(Duration.ofSeconds(3));
	Actions action = new Actions(driver);
	//action.scrollToElement(element).build().perform();
	WebElement showDetails = driver.findElement(By.xpath("//a[contains(text(),'Show details')]"));
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	// When Actions scrollToElement() is not rendering the scroll action then go for JSexecutor 
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	//When WebElement click() and Actions click() are not rendering the click, then go for JavascriptExecutor
	jsExecutor.executeScript("arguments[0].click();", showDetails);
	}
	public static void main(String[] args) throws InterruptedException {
		
		AmzSearchTest amz = new AmzSearchTest();
		amz.launchChromeBrowser();
		amz.launchApp();
		amz.searchAndFindFirstProduct();
		//amz.scrollTo();


	}

}

package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTest {

	String url = "https://www.google.com/";

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
	String searchText ="samsung s5 tablet amazon";
	String xpathString ="Samsung";
	public void searchAndFindFirstProduct() throws InterruptedException {
		WebElement search = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.click(search).sendKeys(searchText).build().perform();
		Thread.sleep(Duration.ofSeconds(3));
		action.moveToElement(search).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		driver.findElement(By.cssSelector("div[data-pla='1'] div[data-pla-slot-pos='1']")).click();
		title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void main(String[] args) throws InterruptedException {
		GoogleTest test = new GoogleTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.handlePrivacy();
		test.searchAndFindFirstProduct();

	}

}

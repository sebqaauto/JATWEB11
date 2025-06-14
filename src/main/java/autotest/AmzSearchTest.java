package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmzSearchTest {

	String url = "https://www.amazon.in/ref=nav_logo";

	//Declaring the driver
	WebDriver driver;
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
		driver.manage().window().maximize();
	}
	//
	public void searchAndFindFirstProduct() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@data-cel-widget='search_result_2']//div[contains(@class,'s-image-fixed-height')]/child::img")).click();
		
	}
	public static void main(String[] args) {
		
		AmzSearchTest amz = new AmzSearchTest();
		amz.launchChromeBrowser();
		amz.launchApp();
		amz.searchAndFindFirstProduct();


	}

}

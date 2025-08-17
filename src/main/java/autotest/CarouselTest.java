package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselTest {

	String url = "https://demowebshop.tricentis.com/";

	//Declaring the driver
	WebDriver driver;

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void interactWithCarousel() {
		driver.findElement(By.xpath("//a[@href='https://academy.tricentis.com' and @style='display: block;']/img")).click();
	}
	
	public static void main(String[] args) {
		CarouselTest test = new CarouselTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.interactWithCarousel();
	}

}

package autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {
	WebDriver driver;
	String url[] = {"https://the-internet.herokuapp.com/hovers", "https://the-internet.herokuapp.com/context_menu", "https://artoftesting.com/samplesiteforselenium"};
	

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	public void launchFirefoxBrowser() {
		driver = new FirefoxDriver();
	}
	public void launchApp() {
		driver.get(url[2]);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(target);
	}
	
	public void hoverOver() {
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='example']/div[@class='figure'][1]/img"));
		
		Actions action = new Actions(driver);
		action.moveToElement(firstElement).build().perform();
	}
	
	public void contextClick() {
		WebElement element = driver.findElement(By.id("hot-spot"));
		Actions action = new Actions(driver);
		//action.contextClick(element).build().perform();
		action.moveToElement(element).contextClick().build().perform();
	}
	
	public void doubleClickEvent() {
		
		WebElement element = driver.findElement(By.id("dblClkBtn"));
		Actions action = new Actions(driver);
		//action.doubleClick(element).build().perform();
		action.moveToElement(element).doubleClick().build().perform();
	}
	
	//

	public static void main(String[] args) {
		
		MouseActions2 act = new MouseActions2();
		act.launchChromeBrowser();
		act.launchApp();
		//act.hoverOver();
		//act.contextClick();
		act.doubleClickEvent();

	}

}

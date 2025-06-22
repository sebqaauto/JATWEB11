package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	//Declaring the driver
			WebDriver driver;
			String url = "https://www.facebook.com/";
			
		
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
				//driver.manage().window().setSize(target);
			}
			// When an element might or might not appear - then go for findElements()
			public void acceptCookies() {
				List<WebElement> cookie = driver.findElements(By.xpath("//div[@tabindex='0']//span[text()='Allow all cookies']"));
				if(cookie.size()>0)
				{
					cookie.get(0).click();
				}
			}
			
			public void keyBoardInteractions() {
				WebElement emailField = driver.findElement(By.cssSelector("#email"));
				Actions act = new Actions(driver);
				act.moveToElement(emailField).click();
				act.keyDown(Keys.SHIFT).sendKeys("test90@test.com").keyUp(Keys.SHIFT).build().perform();
				act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("password").keyUp(Keys.SHIFT).build().perform();
				act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
				
				
			}

	public static void main(String[] args) {
		KeyBoardActions test = new KeyBoardActions();
		test.launchChromeBrowser();
		test.launchApp();
		test.acceptCookies();
		test.keyBoardInteractions();
		

	}

}

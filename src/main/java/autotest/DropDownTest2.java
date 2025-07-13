package autotest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest2 {
	
	WebDriver driver;
	String url = "https://www.dezlearn.com/webtable-example/";
	

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().window().setSize(target);
	}
	
	public void handleCookie() {
		
		List<WebElement> cookie = driver.findElements(By.cssSelector("button[mode='primary']"));
		if(cookie.size()>0) {
			cookie.get(0).click();
			System.out.println("Cookie was found");
		}else {
			System.out.println("Cookie was not found");
		}
		
	}

	
	/*
	 * 1) Write an xpath with a variable to find a Name from the table
	 * 2) Continue the xpath and locate its corresponding drop down element
	 */
	
	
	public void selectCarType(String name, String carType) {
		
		WebElement carDropDown = driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]/following-sibling::td[4]/select"));
		Select dropdown = new Select(carDropDown);
		dropdown.selectByVisibleText(carType);
	}
	public static void main(String[] args) {
		DropDownTest2 test = new DropDownTest2();
		test.launchChromeBrowser();
		test.launchApp();
		test.selectCarType("John", "Hatchback");
	}

}



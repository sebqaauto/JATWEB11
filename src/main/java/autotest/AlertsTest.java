package autotest;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsTest {

	String url = "https://demoqa.com/alerts";

	//Declaring the driver
	WebDriver driver;

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
	
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	String alertText;
	public void handleAlerts() throws InterruptedException {
		//Simple
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		//Thread.sleep(Duration.ofSeconds(3));
		alert.accept();
		System.out.println(alertText);
		
		//Confirm Alert
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", confirmAlert);
		confirmAlert.click();
		alert = driver.switchTo().alert();
		alertText = alert.getText();
		//Thread.sleep(Duration.ofSeconds(3));
		alert.dismiss();
		System.out.println(alertText);
		
		// Prompt Alert
		driver.findElement(By.id("promtButton")).click();
		alert = driver.switchTo().alert();
		alert.sendKeys("Test of Test");
		alertText = alert.getText();
		//Thread.sleep(Duration.ofSeconds(3));
		alert.accept();
		System.out.println(alertText);
		
	}
	
	public static void main(String[] args) {
		
		AlertsTest test = new AlertsTest();
		test.launchChromeBrowser();
		test.launchApp();
		try {
			test.handleAlerts();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

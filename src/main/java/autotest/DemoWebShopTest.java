package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTest {

	String url = "https://demowebshop.tricentis.com/";

	//Declaring the driver
	WebDriver driver;

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	
	public void handlePrivacy() {
		List<WebElement> privacy = driver.findElements(By.cssSelector("button[aria-label='Do not consent']>p"));
		if(privacy.size()>0) {
			privacy.get(0).click();
		}
	}
	
	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
	}
	String emailId = "LastName0032.FirtName0033@test.com";
	String password = "LastName0032";
	
	public void doRegistration() {
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("FirtName0032");	
		driver.findElement(By.id("LastName")).sendKeys("LastName0032");
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		String email = driver.findElement(By.cssSelector(".header-links .account")).getText();
		driver.findElement(By.className("ico-logout")).click();
		System.out.println("Email that was registered is "+email);
	}
	
	public void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(emailId);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector(".login-button")).click();
		String email = driver.findElement(By.cssSelector(".header-links .account")).getText();
		System.out.println("Email that was logged in is "+email);
	}
	
	
	
	public static void main(String[] args) {
		DemoWebShopTest test = new DemoWebShopTest();
		test.launchChromeBrowser();
		test.launchApp();
		//test.doRegistration();
		test.login();
	}

}

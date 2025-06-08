package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {
	
	//Declaring the driver
		WebDriver driver;
		String url = "https://www.facebook.com/";
		String secondUrl = "https://www.facebook.com/r.php?entry_point=login";
		String currentUrl;
		String title;
		Dimension target;
		Boolean elementState;
		
		public void setMobileView() {
			target = new Dimension(430, 932);
		}
		
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
		
		public void webElementInteractions() {
			/*
			 * 1) Find the unique location of the element - findElement() & findElements()
			 * 2) Interact with the element 
			 */
			WebElement createAccountButton = driver.findElement(By.linkText("Create new account"));
			elementState = createAccountButton.isDisplayed();
			System.out.println("The createAccountButton is displayed == "+elementState);
			elementState = createAccountButton.isEnabled();
			System.out.println("The createAccountButton is enabled == "+elementState);
			if(elementState) {
				createAccountButton.click();
			}
			currentUrl = driver.getCurrentUrl();
			System.out.println("The current url is -- "+currentUrl);
			title = driver.getTitle();
			System.out.println("The current title is -- "+title);
			acceptCookies();
			WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
			if(firstName.isEnabled()) {
				firstName.sendKeys("TestFirst");
			}
			
			WebElement lastName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
			if(lastName.isEnabled()) {
				lastName.sendKeys("TestLast ---");
			}
			firstName.clear();
			firstName.sendKeys("New First Name");
			
			WebElement femaleGender = driver.findElement(By.xpath("//label[text()='Female']/input"));
			System.out.println("Is Female gender radio displayed ? "+femaleGender.isDisplayed());
			System.out.println("Is Female gender radio selected ? "+femaleGender.isSelected());
			femaleGender.click();
			System.out.println("Is Female gender radio selected ? "+femaleGender.isSelected());
			
			WebElement learnMoreLink = driver.findElement(By.id("non-users-notice-link"));
			String text = learnMoreLink.getText();
			String tagName = learnMoreLink.getTagName();
			String attributeValue = learnMoreLink.getAttribute("href");
			System.out.println("From the learnMoreLink -- "+text);
			System.out.println("From the learnMoreLink the tag is -- "+tagName);
			System.out.println("From the learnMoreLink the attribute href is -- "+attributeValue);
			attributeValue= learnMoreLink.getAttribute("rel");
			System.out.println("From the learnMoreLink the attribute rel is -- "+attributeValue);
			
			
			WebElement signUpButton = driver.findElement(By.xpath("//*[@name='websubmit']"));
			String buttonColor = signUpButton.getCssValue("background-color");
			System.out.println("The color of the button is "+buttonColor);
			if(buttonColor.equals("rgba(0, 164, 0, 1)")) {
				System.out.println("The button has the expected color");
			}
			
		}
	

	public static void main(String[] args) throws InterruptedException {
		
		WebElementMethods test = new WebElementMethods();
		test.launchChromeBrowser();
		test.launchApp();
		Thread.sleep(3000);
		test.acceptCookies();
		test.webElementInteractions();
	}

}

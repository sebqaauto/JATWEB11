package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hyperlinks {
	
	/*
	 * Find the number of hyper links in the FB page
	 * From the hyper links navigate to the 3rd hyperlink 
	 * From the hyper links navigate to the last hyperlink 
	 * Solution:
	 * 1) Launch the browser and navigate to the url 
	 * 2) Using the tag name which has <a> find all the matching elements - findElements()
	 * 3) Store the matching elements inside List<WebElement> object
	 * 4) object.get(3) => retrieves the 3rd 
	 * 5) How to get the value of href ='' => getAttribute(href) => it returns the href value as a string 
	 * 6) String link = ''
	 * 7) driver.navigate().to(link)
	 */
	

		WebDriver driver;
		String url = "https://www.facebook.com/";
		
		//Open ChromeBrowser
		public void launchBrowser() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new"); 
			driver = new ChromeDriver(options);
				
		}
		
		//Open facebook application
		public void launchApp() {
			driver.get(url);
			driver.manage().window().maximize();
			}
		
		public void webElementFinding() {
			//find element using <a>
			List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
			//find no.of hyperlinks
			int linkCount = hyperLinks.size();
			System.out.println("The number of hyperlinks : "+ linkCount);
			//find 3rd hyperlink value
			WebElement thirdLink = hyperLinks.get(3);
			System.out.println("The 3rd hyperlink value : "+ thirdLink);
			//find hyperlink of the corresponding value
			String hrefValue = thirdLink.getAttribute("href");
			System.out.println("The 3rd hyperlink : "+ hrefValue);
			//navigate to that link
			driver.navigate().to(hrefValue);
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL after navigation : "+ currentUrl);
					
		}
		
		public static void main(String[] args) {
			Hyperlinks testing = new Hyperlinks();
			testing.launchBrowser();
			testing.launchApp();
			testing.webElementFinding();

		}

	}


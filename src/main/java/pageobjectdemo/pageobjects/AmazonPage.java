package pageobjectdemo.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class AmazonPage {
	
	WebDriver driver;

	public AmazonPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchButton;
	
	@FindBy(xpath="//div[@data-cel-widget='search_result_2']//div[contains(@class,'s-image-fixed-height')]/child::img")
	WebElement firstSearchResult;
	
	
	public void searchAndFindFirstProduct(String searchParam) {
		searchBox.clear();
		searchBox.sendKeys(searchParam);
		searchButton.click();
		firstSearchResult.click();
	}
	
	public void validateBrandInfoInPageTitle(String brandName) {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(brandName);
		if(title.contains(brandName)) {
			System.out.println("The brand "+brandName+" is displayed in the title");
		}
	}
	
	public String takeSnap() throws IOException {
		// Selenium takes the screenshot
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	// Store the screenshot taken by Selenium on to file system 
	String title = driver.getTitle();
	String path = "/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/main/java/test-snaps/"+title+".jpg";
	File locationToCopy = new File(path);
	// Copies the screenshot taken by Selenium to our local file system
	Files.copy(screenshot, locationToCopy);
	return path;
	
	}
	

}

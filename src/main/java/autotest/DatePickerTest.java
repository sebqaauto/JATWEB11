package autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerTest {
	String url = "https://www.hyrtutorials.com/p/calendar-practice.html";

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
/*
 * 1) Open the date picker
 * 2) First check the intended year(2025)
 * 3) Second check for the intended month - click next until you land on the intended month 
 * 4) Then choose a specific date 
 */
	String currentMonth;
	public void datePicker(String month, String day ) {
		driver.findElement(By.cssSelector("img[title='Calendar-icon']")).click();
		currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		//loop should continue when it returns false and stop when it returns true
		while(!currentMonth.equals(month)){
			// if the desired & current calendar month are same then I should break the loop
			// if not continue clicking the next button 
			currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			if(!currentMonth.equals(month)) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		String date = driver.findElement(By.id("sixth_date_picker")).getText();
		
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		DatePickerTest test = new DatePickerTest();
		test.launchChromeBrowser();
		test.launchApp();
		test.handlePrivacy();
		test.datePicker("December", "22");
	}

}

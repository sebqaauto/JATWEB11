package autotest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableTest {
/*
 * 1) Find the all the first column's WebElement
 * 2) From them extract the text 
 */
	WebDriver driver;
	String url[] = {"https://the-internet.herokuapp.com/tables"};
	

	public void launchChromeBrowser() {
		// Upward and Downward casting - Upward casting is implicit 
		driver = new ChromeDriver();//GrandParent & GrandChild
		// ChromiumDriver is the parent of ChromeDriver > WebDriver is the parent of ChromiumDriver
		
	}
	public void launchFirefoxBrowser() {
		driver = new FirefoxDriver();
	}
	public void launchApp() {
		driver.get(url[0]);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(target);
	}
	
	public void getColumnValuesFromTable(int columnNumber) {
		List<WebElement> tableElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td["+columnNumber+"]"));
		//table[id='table1']>tbody>tr>td:nth-of-type(1)
		List<String> columnValues = new ArrayList<>();
		String text;
		for (WebElement webElement : tableElements) {
			text = webElement.getText();
			columnValues.add(text);
			System.out.println(text);
		}
		
	}
	
	public void getRowValuesFromTable(int rowNumber) {
		List<WebElement> tableElements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+rowNumber+"]/td"));
		//table[id='table1']>tbody>tr:nth-of-type(1)>td
		List<String> rowValues = new ArrayList<>();
		String text;
		for (WebElement webElement : tableElements) {
			text = webElement.getText();
			rowValues.add(text);
			System.out.println(text);
		}
		
	}
	
	/*
	 * 1) First look in to the Email column and find the email address
	 * 2) For the corresponding email address(same row) find the website link(value)
	 */
	
	public void searchWithEmailId(String emailId) {
	String email =	driver.findElement(By.xpath("//table[@id='table1']//*[text()='" +emailId+ "']")).getText();
	if(email.equals(emailId)) {
	String link = driver.findElement(By.xpath("//table[@id='table1']//*[text()='" +emailId+ "']/following-sibling::td[2]")).getText();
	System.out.println(link);
	}
	}
	
	public static void main(String[] args) {
		
		TableTest table = new TableTest();
		table.launchChromeBrowser();
		table.launchApp();
		table.getColumnValuesFromTable(4);
		table.getRowValuesFromTable(4);
		table.searchWithEmailId("jdoe@hotmail.com");
	}

}

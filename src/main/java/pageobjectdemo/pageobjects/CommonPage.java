package pageobjectdemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPage {
	/*/
	 * 1) WebElements
	 * 2) And its corresponding actions 
	 */
	
	WebDriver driver;
	WebElement registerLink;
	WebElement logoutLink;
	WebElement accountLink;
	
	
	public CommonPage(WebDriver demoDriver) {
		
		this.driver = demoDriver;
	
	}

	
	public void clickOnRegisterLink() {
		registerLink = driver.findElement(By.className("ico-register"));
		if(registerLink.isDisplayed()) {
			registerLink.click();
		}
	}
	
	public String printAccountName() {
		accountLink = driver.findElement(By.cssSelector(".header-links .account"));
		String temp = "";
		if(accountLink.isDisplayed()) {
			temp = accountLink.getText();
			System.out.println("The Email id is "+temp);
			return temp;
		}
		else {
			return temp;
		}
		
	}
	public void clickOnLoginLink() {
		driver.findElement(By.className("ico-login")).click();
	}
	public void clickOnLogoutLink() {
		logoutLink = driver.findElement(By.className("ico-logout"));
		if(logoutLink.isDisplayed()) {
		logoutLink.click();
		}
	}

}

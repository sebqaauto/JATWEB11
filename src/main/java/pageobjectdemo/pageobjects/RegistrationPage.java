package pageobjectdemo.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	public RegistrationPage(WebDriver deomWebShopDriver){
		this.driver = deomWebShopDriver;
		boolean result = this.driver.equals(deomWebShopDriver);
		System.out.println("The result for the driver comparison "+result);
		PageFactory.initElements(driver, this);
	}
	
	//Data
	String emailId = "LastName0032.FirtName0033@test.com";
	String passwordText = "LastName0032";
	
	//WebElements
	//WebElement gender = driver.findElement(By.id("gender-female"));
	
	@FindBy(id="gender-female")
	WebElement genderFemale;
	
	@FindBy(id="gender-male")
	WebElement genderMale;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	//Capturing the methods or actions granular 
	
	public void doRegistration(String fName, String lName, String emailID, String passcode) {
		genderFemale.click();
		firstName.sendKeys(fName);	
		lastName.sendKeys(lName);
		email.sendKeys(emailID);
		password.sendKeys(passcode);
		confirmPassword.sendKeys(passcode);
		registerButton.click();
    }
	
	public void doRegistration(List<String> userInfo) {
		if(userInfo.get(0).equals("male")) {
			genderMale.click();
		}else {
			genderFemale.click();
		}
		firstName.sendKeys(userInfo.get(1));	
		lastName.sendKeys(userInfo.get(2));
		email.sendKeys(userInfo.get(3));
		password.sendKeys(userInfo.get(4));
		confirmPassword.sendKeys(userInfo.get(5));
		registerButton.click();
    }
	
	public void enterfistName(String fName) {
		firstName.sendKeys(fName);	
	}
	
	public void enterlastName(String lName) {
		lastName.sendKeys(lName);	
	}
	
	public void enterEmailName(String emailID) {
		email.sendKeys(emailID);	
	}
	
	public void enterPassword(String passwordText) {
		password.sendKeys(passwordText);	
	}
	
	public void enterConfirmPassword(String passwordText) {
		confirmPassword.sendKeys(passwordText);	
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	
	
}

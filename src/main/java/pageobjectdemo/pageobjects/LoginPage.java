package pageobjectdemo.pageobjects;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	String errorMsg[] = new String[2];
	ArrayList<String> errorMsgs = new ArrayList<>();
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory
		PageFactory.initElements(driver, this);
	}
	
	//WebElements are found using the @FindBy annotation from PageFactory which does Lazy initialization of web elements
	
	@FindBy(id="Email") 
	WebElement emailField;
	
	@FindBy(id="Password") 
	WebElement passwordField;
	
	@FindBy(css=".login-button") 
	WebElement loginButton;
	
	@FindBy(css=".header-links .account") 
	WebElement myAccountLink;
	
	@FindBy(css=".validation-summary-errors>span")
	WebElement errorMsg1;
	
	@FindBy(css=".validation-summary-errors li")
	WebElement errorMsg2;
	
	
	public void doLogin(String emailId, String password) {
		emailField.sendKeys(emailId);
		passwordField.sendKeys(password);
		loginButton.click();
		String email = myAccountLink.getText();
		System.out.println("Email that was logged in is "+email);
	}
	
	public void enterEmailId(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public ArrayList<String> checkErrorMessage() {
		String errormsg1 = errorMsg1.getText();
		String errormsg2 = errorMsg2.getText();
		errorMsgs.add(errormsg1);
		errorMsgs.add(errormsg2);
		return errorMsgs;
	}

}

package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectdemo.pageobjects.CommonPage;
import pageobjectdemo.pageobjects.LoginPage;
import pageobjectdemo.pageobjects.RegistrationPage;

public class StepsDefinitionsClass {
	String url = "https://demowebshop.tricentis.com/";
	WebDriver driver;
	RegistrationPage regPage;
	CommonPage comPage;
	LoginPage loginPage;
	
	@Given("user opens the website demowebshop")
	public void user_opens_the_website_demowebshop() {
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		comPage = new CommonPage(this.driver);
		regPage = new RegistrationPage(this.driver);
		loginPage = new LoginPage(this.driver); 
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@When("user clicks on Register link")
	public void user_clicks_on_register_link() {
		comPage.clickOnRegisterLink();
	}
	
	@When("enters the gender details {string}")
	public void enters_the_gender_details(String string) {
		regPage.selectGender(string);
	}
	@When("enters the first name {string}")
	public void enters_the_first_name(String string) {
	    regPage.enterfistName(string);
	}
	@When("enters the last name {string}")
	public void enters_the_last_name(String string) {
		regPage.enterlastName(string);
	}
	   
	@When("enters the email id {string}")
	public void enters_the_email_id(String string) {
		regPage.enterEmailID(string);
	}
	@When("enters the password {string}")
	public void enters_the_password(String string) {
		regPage.enterPassword(string);
	}
	@When("enters the confirm password {string}")
	public void enters_the_confirm_password(String string) {
		regPage.enterConfirmPassword(string);
	}
	
	@When("clicks on the Register button")
	public void clicks_on_the_register_button() {
		regPage.clickRegisterButton();
	}
	
	@Then("user should be registered successfully")
	public void user_should_be_registered_successfully() {
	   driver.quit();
	}

}

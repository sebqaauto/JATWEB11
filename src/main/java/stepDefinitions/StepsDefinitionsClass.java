package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectdemo.pageobjects.CommonPage;
import pageobjectdemo.pageobjects.HomePage;
import pageobjectdemo.pageobjects.LoginPage;
import pageobjectdemo.pageobjects.RegistrationPage;

public class StepsDefinitionsClass {
	String url = "https://demowebshop.tricentis.com/";
	WebDriver driver;
	RegistrationPage regPage;
	CommonPage comPage;
	LoginPage loginPage;
	HomePage homePage;
	
	// BackGround - Runs before every scenario
	@Given("user opens the website demowebshop")
	public void user_opens_the_website_demowebshop() {
		//Headless mode
		EdgeOptions edgeOptions = new EdgeOptions();
		FirefoxOptions ffOptions = new FirefoxOptions();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); 
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		comPage = new CommonPage(this.driver);
		regPage = new RegistrationPage(this.driver);
		loginPage = new LoginPage(this.driver); 
		homePage = new HomePage(this.driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
	}
	
	// Scenario 1 - Registration Test
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
	
	// Scenario 2 - Adding products to basket from homepage 
	
	@When("user adds the products to basket")
	public void user_adds_the_products_to_basket(DataTable dataTable) {
		List<String> productNames = dataTable.asList();
		for (String string : productNames) {
			homePage.addSpecificProduct(string);
		}
	}
	@When("clicks on go to shopping cart link")
	public void clicks_on_go_to_shopping_cart_link() {
		homePage.goToShoppingCart();
	}
	@Then("user should be landing in shopping cart page")
	public void user_should_be_landing_in_shopping_cart_page() {
	   
	}

}

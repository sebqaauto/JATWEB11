package pageobjectdemo.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageobjectdemo.pageobjects.CommonPage;
import pageobjectdemo.pageobjects.LoginPage;
import pageobjectdemo.pageobjects.RegistrationPage;
import pageobjectdemo.pageobjects.ShoppingCartPage;
import pageobjectdemo.utils.DataBaseHelper;
import pageobjectdemo.utils.DataHelper;

/*
 * Import - you use it as it is 
 * Inheritance - you can change/override the behaviour 
 */

public class DemoWebShopTestNG {

	//String url = "https://demowebshop.tricentis.com/";
	WebDriver driver;
	RegistrationPage regPage;
	CommonPage comPage;
	LoginPage loginPage;
	ShoppingCartPage shopPage;
	DataHelper dataHelper;
	DataBaseHelper dbHelper;
	//Declaring the driver
	
	@BeforeClass
	public void startClassTest() {
		System.out.println("The class has started its test against ");
	}
	
	@AfterClass
	public void endClassTest() {
		System.out.println("The class has ended its test against ");
	}

	@Parameters("demoUrl")
	@BeforeMethod
	public void launchChromeBrowser(String demo_Url) {
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		comPage = new CommonPage(this.driver);
		regPage = new RegistrationPage(this.driver);
		loginPage = new LoginPage(this.driver);
		dataHelper = new DataHelper();
		dbHelper = new DataBaseHelper();
		driver.get(demo_Url);
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
		}	
	}
	
	@Parameters({"firstName","lastName","emailId","password"})
	@Test
	public void test1Registration(String fName, String lName, String emailID, String pass) {
		comPage.clickOnRegisterLink();
		regPage.doRegistration(fName, lName, emailID, pass);
		String accountName = comPage.printAccountName();
		comPage.clickOnLogoutLink();
	}
	
	@Parameters({"password", "emailId"})
	@Test(dependsOnMethods = "test1Registration", alwaysRun=true)
	public void test2Login(String password, String emailId) {
		comPage.clickOnLoginLink();
		loginPage.doLogin(emailId, password);
		comPage.clickOnLogoutLink();
	}
	
	@Parameters("emailId")
	@Test(enabled = true)
	public void test3LoginWithInvalidPassword(String email) {
		comPage.clickOnLoginLink();
		loginPage.enterEmailId(email);
		loginPage.clickOnLoginButton();
		ArrayList<String> errorMsg = loginPage.checkErrorMessage();
		System.out.println(errorMsg.get(0));
		System.out.println(errorMsg.get(1));
	}
	
	@Parameters("emailId")
	@Test(enabled = true)
	public void test3LoginWithInvalidEmail(String email) {
		comPage.clickOnLoginLink();
		loginPage.enterEmailId(email);
		loginPage.enterPassword("FirstName232.lastname");
		loginPage.clickOnLoginButton();
	}
	
	public void getDataFromExcel() {
		try {
			dataHelper.readAllDataFromExcel("userInfo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	List<String> userDetails;
	@Test(enabled = false)
	public void test5RegistrationWithExcel()  {
		comPage.clickOnRegisterLink();
		try {
			userDetails = dataHelper.readRowSpecificDataFromExcel("userInfo", 3);
			regPage.doRegistration(userDetails);
			String regUser = comPage.printAccountName();
			dataHelper.writeRegUsersToExcel(regUser, userDetails.get(4), "registeredUsers");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	@Parameters("userName")
	@Test(enabled = false)
	public void test6RegistrationFromDB(String user) {
		try {
			comPage.clickOnRegisterLink();
			userDetails = dbHelper.fetchDBData(user);
			regPage.doRegistration(userDetails);
			String regUser = comPage.printAccountName();
			try {
				dataHelper.writeRegUsersToExcel(regUser, userDetails.get(4), "registeredUsers");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}

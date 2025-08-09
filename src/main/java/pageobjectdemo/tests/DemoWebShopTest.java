package pageobjectdemo.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class DemoWebShopTest {

	String url = "https://demowebshop.tricentis.com/";
	WebDriver driver;
	RegistrationPage regPage;
	CommonPage comPage;
	LoginPage loginPage;
	ShoppingCartPage shopPage;
	DataHelper dataHelper;
	DataBaseHelper dbHelper;
	//Declaring the driver
	

	public void launchChromeBrowser() {
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		comPage = new CommonPage(this.driver);
		regPage = new RegistrationPage(this.driver);
		loginPage = new LoginPage(this.driver);
		dataHelper = new DataHelper();
		dbHelper = new DataBaseHelper();
	}

	public void launchApp() {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void test1Registration() {
		comPage.clickOnRegisterLink();
		regPage.doRegistration("FirstName232", "LastName232", "FirstName2501.lastname@test.com", "FirstName232.lastname");
		String accountName = comPage.printAccountName();
		comPage.clickOnLogoutLink();
		System.out.println("test1Registration Executed from " + Thread.currentThread().getName());
	}
	
	public void test2Login() {
		comPage.clickOnLoginLink();
		loginPage.doLogin("FirstName232.lastname@test.com", "FirstName232.lastname");
		comPage.clickOnLogoutLink();
		System.out.println("test2Login Executed from " + Thread.currentThread().getName());
	}
	
	public void test3LoginWithInvalidPassword() {
		comPage.clickOnLoginLink();
		loginPage.enterEmailId("FirstName2308.lastname@test.com");
		loginPage.clickOnLoginButton();
		ArrayList<String> errorMsg = loginPage.checkErrorMessage();
		System.out.println(errorMsg.get(0));
		System.out.println(errorMsg.get(1));
		System.out.println("test3LoginWithInvalidPassword Executed from " + Thread.currentThread().getName());
	}
	
	public void test3LoginWithInvalidEmail() {
		comPage.clickOnLoginLink();
		loginPage.enterEmailId("FirstName2308.lastname");
		loginPage.enterPassword("FirstName232.lastname");
		loginPage.clickOnLoginButton();
		System.out.println("test3LoginWithInvalidEmail Executed from " + Thread.currentThread().getName());
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
	public void test5RegistrationWithExcel()  {
		comPage.clickOnRegisterLink();
		try {
			userDetails = dataHelper.readRowSpecificDataFromExcel("userInfo", 7);
			regPage.doRegistration(userDetails);
			String regUser = comPage.printAccountName();
			dataHelper.writeRegUsersToExcel(regUser, userDetails.get(4), "registeredUsers");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	public void test6RegistrationFromDB() {
		try {
			comPage.clickOnRegisterLink();
			userDetails = dbHelper.fetchDBData("Sachin");
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
	
	//single threaded main method
	public static void main(String[] args) {
		//test 1
		DemoWebShopTest test = new DemoWebShopTest();
		test.launchChromeBrowser();
		test.launchApp();
		//test.test1Registration();
		//test2 
		//test.test2Login();
		//test3
		//test.test3LoginWithInvalidPassword();
		//test4
		//test.test3LoginWithInvalidEmail();
		//test5 - testing the connectivity with Excel workbook
		//test.getDataFromExcel();
		//test6 - registration with data from the Excel workbook
		//test.test5RegistrationWithExcel();
		//test to interact with DB 
		test.test6RegistrationFromDB();
		
	}

}

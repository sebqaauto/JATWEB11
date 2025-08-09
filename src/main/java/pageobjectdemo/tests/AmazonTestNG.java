package pageobjectdemo.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageobjectdemo.pageobjects.AmazonPage;


public class AmazonTestNG {
	
	WebDriver driver;
	AmazonPage amz;
	//Declaring the driver
	
	@BeforeClass
	public void startClassTest() {
		System.out.println("The class has started its test against ");
	}
	
	@AfterClass
	public void endClassTest() {
		System.out.println("The class has ended its test against ");
	}


	@BeforeMethod
	public void launchChromeBrowser() {
		driver = new ChromeDriver();//GrandParent & GrandChild => ancestor relationship	
		amz = new AmazonPage(this.driver);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
	}
	
	@AfterMethod
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
		}	
	}
	
	@Test(enabled =false)
	public void runiPhoneSearchTest() {
		amz.searchAndFindFirstProduct("iphone 15");
		System.out.println("runiPhoneSearchTest Executed from " + Thread.currentThread().getName());
	}
	
	@Test(enabled =false)
	public void runSamsungSearchTest() {
		amz.searchAndFindFirstProduct("samsung");
		System.out.println("runSamsungSearchTest Executed from " + Thread.currentThread().getName());
	}
	
	@Test(enabled =false)
	public void runMotorolaSearchTest() {
		amz.searchAndFindFirstProduct("motorola");
		System.out.println("runMotorolaSearchTest Executed from " + Thread.currentThread().getName());
	}
	
	@DataProvider(name="search-data")
	public Object[] provideSearchData() {
		return new Object[] {"iphone 15", "samsung", "motorola"};
	}
	
	@Test(dataProvider="search-data")
	public void runSearchTest(String searchText) {
		amz.searchAndFindFirstProduct(searchText);
		System.out.println("runMotorolaSearchTest Executed from " + Thread.currentThread().getName());
	}
	
	@DataProvider
	public Object[][] provideBrandAndSearchData() {
		return new Object [][] {
			{"Sony", "sony bravia 55 inch"},//row 1
			{"Xiaomi", "xiomi̇ pad 7 pro"},// row 2
			{"TCL", "tcl 55 inch tv"},// row 3
		};
	}
	
	
	@Test(dataProvider="provideBrandAndSearchData")
	public void runSearchTestForBrands(String brand, String searchText) {
		amz.searchAndFindFirstProduct(searchText);
		amz.validateBrandInfoInPageTitle(brand);
		System.out.println("runSearchTestForBrands Executed from " + Thread.currentThread().getName());
	}
	
	
	

}
